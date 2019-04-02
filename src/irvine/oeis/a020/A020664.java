package irvine.oeis.a020;

import irvine.oeis.a005.A005837;

/**
 * A020664 Lexicographically earliest increasing sequence of positive numbers that contains no arithmetic progression of length 10.
 * @author Sean A. Irvine
 */
public class A020664 extends A005837 {

  @Override
  protected int limit() {
    return 10;
  }
}
