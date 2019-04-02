package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020663 lexicographically earliest increasing sequence of nonnegative numbers that contains no arithmetic progression of length 10.
 * @author Sean A. Irvine
 */
public class A020663 extends A020664 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
