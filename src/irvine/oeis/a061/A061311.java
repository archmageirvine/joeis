package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061311 Length of n-th term of A061074, or 0 if no term of A061074 of length n.
 * @author Sean A. Irvine
 */
public class A061311 extends A061074 {

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isZero() ? t : Z.valueOf(t.toString().length());
  }
}
