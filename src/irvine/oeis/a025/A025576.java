package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025576 a(n) = T(n,[ n/2 ]+1), where T is the array defined in A025564.
 * @author Sean A. Irvine
 */
public class A025576 extends A025564 {

  /** Construct the sequence. */
  public A025576() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, (mN + 1) / 2 + 1);
  }
}
