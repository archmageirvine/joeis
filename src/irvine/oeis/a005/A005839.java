package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005839 Lexicographically earliest increasing nonnegative sequence that contains no 4-term arithmetic progression.
 * @author Sean A. Irvine
 */
public class A005839 extends A005837 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
