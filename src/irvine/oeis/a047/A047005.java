package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047005 T(n,n-3), array T given by A047000.
 * @author Sean A. Irvine
 */
public class A047005 extends A047000 {

  /** Construct the sequence. */
  public A047005() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
