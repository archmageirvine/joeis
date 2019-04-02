package irvine.oeis.a020;

import irvine.oeis.a005.A005837;

/**
 * A020660 Lexicographically earliest increasing sequence of positive numbers that contains no arithmetic progression of length 8.
 * @author Sean A. Irvine
 */
public class A020660 extends A005837 {

  @Override
  protected int limit() {
    return 8;
  }
}
