package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047025 T(n,n-3), array T given by A047020.
 * @author Sean A. Irvine
 */
public class A047025 extends A047020 {

  /** Construct the sequence. */
  public A047025() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
