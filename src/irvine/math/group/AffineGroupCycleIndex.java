package irvine.math.group;

import java.io.BufferedReader;
import java.io.IOException;
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
import irvine.util.io.IOUtils;

/**
 * Cycle index for affine group from precomputed data.
 * @author Sean A. Irvine
 */
public final class AffineGroupCycleIndex {

  private AffineGroupCycleIndex() { }

  /**
   * Return the cycle index of <code>AG_n(Z_2)</code>.
   * @param n index
   * @return cycle index
   */
  public static CycleIndex cycleIndex(final int n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    try {
      try (final BufferedReader r = IOUtils.reader("irvine/math/group/ag/" + n + ".gz")) {
        final String s = r.readLine();
        if (s == null) {
          throw new UnsupportedOperationException();
        }
        final int space = s.indexOf(' ');
        final Z order = new Z(s.substring(0, space));
        final CycleIndex ci = new CycleIndex("AG_" + n + "(Z_2)");
        final String[] spec = s.substring(space + 1).split("]");
        for (final String t : spec) {
          final int leftBracket = t.indexOf('[');
          final Z mm = new Z(t.substring(0, leftBracket));
          final String[] coeffs = t.substring(leftBracket + 1).split(",");
          final MultivariateMonomial m = new MultivariateMonomial();
          for (int k = 0; k < coeffs.length; ++k) {
            m.add(k + 1, Integer.parseInt(coeffs[k]));
          }
          m.setCoefficient(new Q(mm, order));
          ci.add(m);
        }
        return ci;
      }
    } catch (final IOException | NullPointerException e) {
      throw new UnsupportedOperationException(e);
    }
  }

  /**
   * Print cycle index.
   * @param args cycle index to print.
   */
  public static void main(final String[] args) {
    System.out.println(cycleIndex(Integer.parseInt(args[0]), new GaloisField(args.length <= 1 ? 2 : Integer.parseInt(args[1]))));
  }

//  /**
//   * Print cycle index.
//   *
//   * @param args cycle index to print.
//   */
//  public static void main(final String[] args) {
//    System.out.println(cycleIndex(Integer.parseInt(args[0])));
//  }

  // todo refactor into GeneralLinearCycleIndex

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

  private static MultivariateMonomial hypercompanionCycleTypeAff(final int d, final int exp, final int i, final int p, final int q) {
    int e = 1;
    int hilf = i;
    while (hilf > e) {
      e *= p;
    }
    --hilf;
    Z hilf1 = Z.valueOf(q).pow(hilf);
    Z t2 = hilf1.divide(e);
    final MultivariateMonomial mm = MultivariateMonomial.create(e - 1, t2);
    //mm.add(e - 1, t2);
    --hilf;
    hilf1 = Z.valueOf(q).pow(hilf);
    hilf = q - 1;
    hilf1 = hilf1.multiply(hilf);
    mm.setCoefficient(hilf1);
    System.out.println("zykeltyp_hyperbegleitmatrix_poly_afferg: " + mm);
    return mm;
  }

  /*
  static INT zykeltyp_hyperbegleitmatrix_poly_afferg(exp,i,p,q,ergeb) OP exp,p,q,ergeb; INT i;
  {
    M_I_I(1L,e);
    M_I_I(i,hilf);
    while (gt(hilf,e))
    {
      mult_apply(p,e);
    }
    dec(hilf);
    hoch(q,hilf,hilf1);
    ganzdiv(hilf1,e,hilf2);
    m_iindex_iexponent_monom(s_i_i(e)-1L,s_i_i(hilf2),ergeb);
    dec(hilf);
    hoch(q,hilf,hilf1);
    copy(q,hilf);
    dec(hilf);
    mult_apply(hilf,hilf1);
    mult_apply(hilf1,ergeb);
  }
  */

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
    if (d != 1 || (q != 2 && exp != 1)) {
      for (int i = 1; i < mu.length; ++i) {
        if (mu[i] != 0) {
          final MultivariateMonomial hct = hypercompanionCycleType(d, exp, i, p, q);
          hct.setCoefficient(Z.valueOf(q).pow(d * i));
          final CycleIndex hilf1 = new CycleIndex("", hct).pow(HararyMultiply.OP, mu[i], Integer.MAX_VALUE);
          res = res.op(HararyMultiply.OP, hilf1);
        }
      }
    } else {
      for (int i = 1; i < mu.length; ++i) {
        if (mu[i] != 0) {
          final MultivariateMonomial hct = hypercompanionCycleType(d, exp, i, p, q);
          hct.setCoefficient(Z.valueOf(q).pow(i - 1));
          final CycleIndex t = new CycleIndex("", hct);
          System.out.println("t=" + t); // sai
          final MultivariateMonomial hctAff = hypercompanionCycleTypeAff(d, exp, i + 1, p, q);
          t.add(hctAff);
          System.out.println("prepower=" + t + " mu=" + mu[i]); // sai
          final CycleIndex hilf1 = t.pow(HararyMultiply.OP, mu[i], Integer.MAX_VALUE); // todo this is not getting the right thing!
          System.out.println("pow=" + hilf1); // sai
          res = res.op(HararyMultiply.OP, hilf1);
        }
      }
    }
    res.multiply(new Q(Z.ONE, kung(d, mu, q)));
    System.out.println("cycle: " + res); // sai
    return res;
  }

  /*
  static INT zykeltyp_poly_part_aff(d,exp,mu,p,q,ergeb) OP d,exp,mu,p,q,ergeb;
{
    m_iindex_monom(0L,ergeb);
    if ((!einsp(d)) || ((S_I_I(q)!=2L) && (S_I_I(exp)!=1L)))    {
      for (i=0L;i<S_PA_LI(mu);++i)      {
        if (S_PA_II(mu,i)!=0L)        {
          zykeltyp_hyperbegleitmatrix_poly(d,exp,i+1L,p,q,hilf);
          m_i_i(i+1L,hilf1);
          mult_apply(d,hilf1);
          hoch(q,hilf1,hilf1);
          mult_apply(hilf1,hilf);
          zykelind_hoch_dir_prod(hilf,S_PA_I(mu,i),hilf1);
          zykelind_dir_prod_apply(hilf1,ergeb);
        }
      }
    }    else    {
      for (i=0L;i<S_PA_LI(mu);++i)      {
        if (S_PA_II(mu,i)!=0L)        {
          zykeltyp_hyperbegleitmatrix_poly(d,exp,i+1L,p,q,hilf);
          m_i_i(i,hilf1);
          hoch(q,hilf1,hilf1);
          mult_apply(hilf1,hilf);
          zykeltyp_hyperbegleitmatrix_poly_afferg(exp,i+2L,p,q,hilf1);
          add_apply(hilf1,hilf);
          zykelind_hoch_dir_prod(hilf,S_PA_I(mu,i),hilf1);
          zykelind_dir_prod_apply(hilf1,ergeb);
        }
      }
    }
    kung_formel(d,mu,q,hilf);
    invers_apply(hilf);
    m_scalar_polynom(hilf,hilf1);
    mult_apply(hilf1,ergeb);
}
   */

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
//    erg+=hoch(q,k,hilf);
//    erg+=invers_apply(hilf);
//    erg+=mult_apply(hilf,ergeb);
    res.multiply(new Q(Z.ONE, Z.valueOf(q).pow(k)));
    return res;
  }

}
