package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026867 T(2n+1,n+3), T given by A026747.
 * @author Sean A. Irvine
 */
public class A026867 extends A026747 {

  /** Construct the sequence. */
  public A026867() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 3);
  }
}
