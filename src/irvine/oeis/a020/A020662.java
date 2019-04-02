package irvine.oeis.a020;

import irvine.oeis.a005.A005837;

/**
 * A020662 Lexicographically earliest increasing sequence of positive numbers that contains no arithmetic progression of length 9.
 * @author Sean A. Irvine
 */
public class A020662 extends A005837 {

  @Override
  protected int limit() {
    return 9;
  }
}
