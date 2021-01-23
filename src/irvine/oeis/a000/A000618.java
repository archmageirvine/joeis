package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000618 Number of nondegenerate Boolean functions of n variables: For n &gt; 0, a(n) = A000616(n) - A000616(n-1).
 * @author Sean A. Irvine
 */
public class A000618 extends A000616 {

  private Z mPrev = Z.ZERO;
  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.subtract(mPrev);
    mPrev = t;
    return r;
  }
}
