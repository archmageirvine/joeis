package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025570 a(n) = T(2n,n), where T is the array defined in A025564.
 * @author Sean A. Irvine
 */
public class A025570 extends A025564 {

  /** Construct the sequence. */
  public A025570() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return get(2 * mN - 1, mN);
  }
}
