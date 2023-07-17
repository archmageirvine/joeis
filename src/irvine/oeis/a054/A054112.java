package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054112 T(n,n-3), array T as in A054110.
 * @author Sean A. Irvine
 */
public class A054112 extends A054110 {

  /** Construct the sequence. */
  public A054112() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return t(++mN, mN - 3);
  }
}
