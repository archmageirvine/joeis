package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047024 T(n,n-2), array T given by A047020.
 * @author Sean A. Irvine
 */
public class A047024 extends A047020 {

  /** Construct the sequence. */
  public A047024() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
