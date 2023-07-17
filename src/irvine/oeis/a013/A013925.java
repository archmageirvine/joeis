package irvine.oeis.a013;

import irvine.math.z.Z;

/**
 * A013925 Number of labeled connected graphs with n nodes and 3 cutpoints.
 * @author Sean A. Irvine
 */
public class A013925 extends A013924 {

  /** Construct the sequence. */
  public A013925() {
    super(5);
  }

  private int mN = 4;

  @Override
  public Z next() {
    return get(3, ++mN);
  }
}
