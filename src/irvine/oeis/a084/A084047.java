package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a072.A072883;

/**
 * A084047 Smallest prime p such that p - n is an n-th power, or 0 if no such number exists; i.e., smallest prime of the form k^n + n.
 * @author Sean A. Irvine
 */
public class A084047 extends A072883 {

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isZero() ? Z.ZERO : t.pow(mN).add(mN);
  }
}

