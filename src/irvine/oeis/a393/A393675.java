package irvine.oeis.a393;

import irvine.oeis.a002.A002808;

/**
 * A393675 a(n) = number of partitions of n into distinct composite parts, no two of which are consecutive in A002808.
 * @author Sean A. Irvine
 */
public class A393675 extends A393674 {

  /** Construct the sequence. */
  public A393675() {
    super(new A002808());
  }
}
