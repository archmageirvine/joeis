package irvine.oeis.a393;

import irvine.oeis.a000.A000217;

/**
 * A393673 a(n) = number of partitions of n into distinct parts that are triangular numbers, no two of which are consecutive triangular numbers.
 * @author Sean A. Irvine
 */
public class A393673 extends A393674 {

  /** Construct the sequence. */
  public A393673() {
    super(new A000217());
  }
}
