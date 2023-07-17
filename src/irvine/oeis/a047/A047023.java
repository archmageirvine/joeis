package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047023 T(n,n-1), array T given by A047020.
 * @author Sean A. Irvine
 */
public class A047023 extends A047020 {

  /** Construct the sequence. */
  public A047023() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
