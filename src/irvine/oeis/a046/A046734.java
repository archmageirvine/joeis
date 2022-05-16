package irvine.oeis.a046;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046734 Period of A000213 mod n.
 * @author Sean A. Irvine
 */
public class A046734 implements Sequence {

  // After Charles R Greathouse IV

  private int mN = 0;

  private int per(final Z[] v, final int startAt) {
    outer:
    for (int k = startAt; k < v.length - 3; ++k) {
      for (int i = 0; i < 3; ++i) {
        if (!v[i].equals(v[k + i + 1])) {
          continue outer;
        }
      }
      return k + 1;
    }
    return 0;
  }

  private int ap(final int p) {
    final Z pp = Z.valueOf(p);
    Z[] v = new Z[99];
    v[0] = Z.ONE;
    v[1] = Z.ONE;
    v[2] = Z.ONE;
    for (int k = 3; k < v.length; ++k) {
      v[k] = v[k - 1].add(v[k - 2]).add(v[k - 3]).mod(pp);
    }
    int t;
    while ((t = per(v, v.length > 99 ? v.length / 2 - 3 : 0)) == 0) {
      v = Arrays.copyOf(v, 2 * v.length);
      for (int k = v.length / 2; k < v.length; ++k) {
        v[k] = v[k - 1].add(v[k - 2]).add(v[k - 3]).mod(pp);
      }
    }
    return t;
  }

  private int ape(final int p, final int e) {
    if (p == 2) {
      return e > 1 ? Z.valueOf(p).pow(e).intValueExact() : 1;
    }
    if (e == 1) {
      return ap(p);
    }
    final Z pe1 = Z.valueOf(p).pow(e - 1);
    final Z pe = pe1.multiply(p);
    final Z bigP = pe1.multiply(ap(p));
    final Z[] v = new Z[bigP.add(3).intValueExact()];
    v[0] = Z.ONE;
    v[1] = Z.ONE;
    v[2] = Z.ONE;
    for (int k = 3; k < v.length; ++k) {
      v[k] = v[k - 1].add(v[k - 2]).add(v[k - 3]).mod(pe);
    }
    return per(v, 0);
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z res = Z.ONE;
    for (final Z p : fs.toZArray()) {
      res = res.lcm(Z.valueOf(ape(p.intValue(), fs.getExponent(p))));
    }
    return res;
  }
}
