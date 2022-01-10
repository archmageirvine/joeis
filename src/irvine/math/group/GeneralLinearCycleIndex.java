package irvine.math.group;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.api.Ring;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.partitions.NonnegativeIntegerComposition;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;

/**
 * Cycle index for general linear group over a finite field.
 * @author Sean A. Irvine
 */
public final class GeneralLinearCycleIndex {

  // Based in part on C code from the SYMMETRICA V2.0 package.

  private GeneralLinearCycleIndex() { }

  /**
   * Print cycle index.
   * @param args cycle index to print.
   */
  public static void main(final String[] args) {
    System.out.println(cycleIndex(Integer.parseInt(args[0]), new GaloisField(args.length <= 1 ? 2 : Integer.parseInt(args[1]))));
  }

  // a and b are return values here!
  private static void getExponents(final int d, final int q, final List<List<Z>> a, final List<List<Z>> b) {
    final TreeSet<Z> seen = new TreeSet<>();
    for (int i = 0; i < d; ++i) {
      final long dd = i + 1;
      final List<Z> aa = new ArrayList<>();
      final List<Z> bb = new ArrayList<>();
      final Z c = Z.valueOf(q).pow(dd).subtract(1);
      final Z[] e = Jaguar.factor(c).divisors();
      for (final Z z : e) {
        if (dd == 1 && Z.ONE.equals(z)) {
          bb.add(Z.ONE);
          aa.add(z);
          seen.add(z);
        } else {
          final Z f = Euler.phi(z);
          final Z[] qr = f.divideAndRemainder(Z.valueOf(dd));
          final Z g = qr[0];
          final Z h = qr[1];
          if (h.isZero()) {
            if (seen.add(z)) {
              aa.add(z);
              bb.add(g);
            }
          }
        }
      }
      a.add(aa);
      b.add(bb);
    }
  }

  /*
    Calculated according to a formula by J.P. Kung as the number of
    matrices in GL(cd, Fq) with a matrix derived from lambda(1)
    supplementary matrices of an irreducible polynomial p, lambda(2)
    There is hyper-accompanying margins of p^2 etc.
    Here d is the degree of the polynomial p, lambda a partition of c (that
    is the highest power of p, which is the characteristic polynomial of a
    matrix divides of which D(p, lambda) is a block), q the power
    of the body.
   */
  private static Z kung(final int d, final int[] lambda, final int q) {
    long mu = 0;
    Z anz = Z.ONE;
    for (int i = 1; i < lambda.length; ++i) {
      for (int j = i; j < lambda.length; ++j) {
        mu += lambda[j];
      }
      final Z qp = Z.valueOf(q).pow(d * mu);
      for (int j = 1; j <= lambda[i]; ++j) {
        anz = anz.multiply(qp.subtract(Z.valueOf(q).pow((mu - j) * d)));
      }
    }
    return anz;
  }

  /*
  Determines the cycle type of the hypercompanion matrix of p(x)^i, a
  irreducible normalized polynomial of degree d with exponent exp, over
  a body with characteristic p and power q.
   */
  private static MultivariateMonomial hypercompanionCycleType(final int d, final int exp, final int i, final int p, final int q) {
    final int[] e = new int[i];
    e[0] = exp;
    int k = 1;
    for (int j = 1; j < i; ++j) {
      e[j] = e[j - 1];
      if (k < j + 1L) {
        k = k * p;
        e[j] *= p;
      }
    }
    final MultivariateMonomial mm = MultivariateMonomial.create(1, Z.ONE);
    final Z t = Z.valueOf(q).pow(d);
    Z t1 = t.subtract(1);
    Z t2 = t1.divide(exp);
    mm.add(exp, t2);
    for (int j = 1; j < i; ++j) {
      t1 = t1.multiply(t);
      t2 = t1.divide(e[j]);
      mm.add(e[j], t2);
    }
    return mm;
  }

  private static CycleIndex z1(final String name) {
    return new CycleIndex(name, MultivariateMonomial.create(1, 1));
  }

  /*
    Computes the cycle type of a block diagonal matrix from existing
    companion and hypercompanion matrices of an irreducible normalized polynomial
    of degree d, exponent (= period or order) exp; the shape of this
    matrix is determined by the partition mu, p is the characteristic
    of the body, q its order.
   */
  private static CycleIndex cycleTypePolyPart(final int d, final int exp, final int[] mu, final int p, final int q) {
    //System.out.println("zykeltyp_poly_part(" + d + " " + exp + " " + Arrays.toString(mu) + " " + p + " " + q + ")");
    CycleIndex res = CycleIndex.ONE.copy();
    res.setName("");
    for (int i = 1; i < mu.length; ++i) {
      if (mu[i] != 0) {
        final MultivariateMonomial hct = hypercompanionCycleType(d, exp, i, p, q);
        final CycleIndex hilf1 = new CycleIndex("", hct).pow(HararyMultiply.OP, mu[i], Integer.MAX_VALUE);
        res = res.op(HararyMultiply.OP, hilf1);
      }
    }
    res.multiply(new Q(Z.ONE, kung(d, mu, q)));
    return res;
  }

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();

  private static Z multinomialExt(final int a, final int[] b) {
    Z den = Z.ONE;
    int s = a;
    for (final int j : b) {
      s -= j;
      den = den.multiply(FACTORIAL.factorial(j));
    }
    den = den.multiply(FACTORIAL.factorial(s));
    return FACTORIAL.factorial(a).divide(den);
  }

  static CycleIndex cycleIndex(final int k, final Ring<?> fld) {
    final int q = fld.size().intValueExact();
    final int characteristic = fld.characteristic().intValueExact();
    final List<List<Z>> v1 = new ArrayList<>();
    final List<List<Z>> v2 = new ArrayList<>();
    getExponents(k, q, v1, v2); // fills v1 and v2
    final CycleIndex res = new CycleIndex("GL(" + k + "," + q + ")");

    final int[] c = new int[k + 1];
    final IntegerPartition part = new IntegerPartition(k);
    int[] p;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      CycleIndex zs1 = z1("zs1");
      for (int i = 1; i < c.length; ++i) {  /*3*/
        //System.out.printf("Doing c[%d]=%d%n", i-1, c[i]); //sai
        if (c[i] > 0) {  /*4*/
          final CycleIndex zs2 = new CycleIndex("");
          //System.out.println(c[i] + " into " + v1.get(i-1).size() + " parts"); // sai
          final NonnegativeIntegerComposition comp = new NonnegativeIntegerComposition(c[i], v1.get(i - 1).size());
          int[] c1;
          while ((c1 = comp.next()) != null) {
            //System.out.println("c1: " + Arrays.toString(c1)); // sai
            CycleIndex zs3 = CycleIndex.ONE.copy();
            for (int j = 0; j < c1.length; ++j) { /*6*/
              if (c1[j] != 0) { /*7*/
                final CycleIndex zs4 = new CycleIndex("");
                final int pc2k = v2.get(i - 1).get(j).intValueExact();
                // We want to partition c1[j] into at most pc2k parts.
                // todo be better to have a proper class for this
                //System.out.println("c1: Starting integer partitions of " + c1[j] + " " + pc2k);
                final IntegerPartition pc2 = new IntegerPartition(c1[j]);
                final int[] c2 = new int[c1[j] + 1];
                int[] p2;
                while ((p2 = pc2.next()) != null) {
                  if (p2.length > pc2k) {
                    continue;
                  }
                  IntegerPartition.toCountForm(p2, c2);
                  //System.out.println("c2: " + Arrays.toString(c2) + " " + Arrays.toString(p2)); // sai
                  CycleIndex zs5 = CycleIndex.ONE.copy();
                  for (final int l : p2) {  /*9*/
                    if (l != 0) {  /*10*/
                      final CycleIndex zs6 = CycleIndex.ZERO.copy();
                      zs6.setName("");
                      final IntegerPartition part3 = new IntegerPartition(l);
                      int[] p3;
                      final int[] c3 = new int[l + 1];
                      while ((p3 = part3.next()) != null) {
                        IntegerPartition.toCountForm(p3, c3);
                        //System.out.println("c3: " + Arrays.toString(c3)); // sai
                        zs6.add(cycleTypePolyPart(i, v1.get(i - 1).get(j).intValueExact(), c3, characteristic, q));
                      }
                      //System.out.println("zs6: " + zs6); //sai
                      zs5 = zs5.op(HararyMultiply.OP, zs6);
                    }  /*10*/
                  }  /*9*/
                  zs5.multiply(new Q(multinomialExt(v2.get(i - 1).get(j).intValueExact(), c2)));
                  zs4.add(zs5);
                }
                //System.out.println("zs4: " + zs4); // sai
                zs3 = zs3.op(HararyMultiply.OP, zs4);
              }  /*7*/
            }  /*6*/
            //System.out.println("zs3: " + zs3); // sai
            zs2.add(zs3);
          } /*5*/
          //System.out.println("zs2: " + zs2); // sai
          zs1 = zs1.op(HararyMultiply.OP, zs2);
        }  /*4*/
      }  /*3*/
      res.add(zs1);
      //System.out.println("c=" + Arrays.toString(c)); // sai
      //System.out.println("zs1: " + zs1);
    }
    return res;
  }
}
