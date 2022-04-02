package irvine.oeis.a284;

import irvine.oeis.HolonomicRecurrence;

/**
 * A284016 a(-1)=-1; a(n) = 2*A000108(n) for n &gt;= 0.
 * @author Georg Fischer
 */
public class A284016 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A284016() {
    super(-1, "[[0],[2,-4],[1, 1]]", "-1, 2", 0);
  }
}
