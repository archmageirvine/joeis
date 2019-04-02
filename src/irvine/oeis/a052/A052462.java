package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052462 a(n) is the solution k to Mod[24k,5^n]==1.
 * @author Sean A. Irvine
 */
public class A052462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052462() {
    super(new long[] {-25, 25, 1}, new long[] {4, 24, 99});
  }
}
