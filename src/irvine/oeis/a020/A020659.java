package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020659 Lexicographically earliest increasing sequence of nonnegative numbers that contains no arithmetic progression of length 8.
 * @author Sean A. Irvine
 */
public class A020659 extends A020660 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
