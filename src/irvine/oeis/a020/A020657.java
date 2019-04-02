package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020657 Lexicographically earliest increasing sequence of nonnegative numbers that contains no arithmetic progression of length 7.
 * @author Sean A. Irvine
 */
public class A020657 extends A020658 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
