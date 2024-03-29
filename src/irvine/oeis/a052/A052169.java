package irvine.oeis.a052;
// Generated by gen_seq4.pl holos at 2021-07-07 22:49

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A052169 Equivalent of the Kurepa hypothesis for left factorial.
 * -a(n)+(n-2)*a(n-1)+(n-3)*a(n-2)
 * @author Georg Fischer
 */
public class A052169 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A052169() {
    super(2, "[[0],[-3, 1],[-2, 1],[-1]]", "[1, 2]", 0);
  }
}
