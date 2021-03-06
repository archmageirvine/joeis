package irvine.oeis.a020;

import irvine.oeis.a005.A005837;

/**
 * A020658 Lexicographically earliest increasing sequence of positive numbers that contains no arithmetic progression of length 7.
 * @author Sean A. Irvine
 */
public class A020658 extends A005837 {

  @Override
  protected int limit() {
    return 7;
  }
}
