package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069343 Number of n X n binary arrays with path of adjacent 1's from upper right corner to lower left corner.
 * @author Sean A. Irvine
 */
public class A069343 extends A069326 {

  /** Construct the sequence. */
  public A069343() {
    super(1, 0);
  }

  @Override
  public Z next() {
    return count(++mN, mN);
  }
}
