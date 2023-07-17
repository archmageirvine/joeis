package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047014 T(n,n-2), array T given by A047010.
 * @author Sean A. Irvine
 */
public class A047014 extends A047010 {

  /** Construct the sequence. */
  public A047014() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
