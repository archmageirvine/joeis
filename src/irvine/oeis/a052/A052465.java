package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052465 <code>a(n)</code> is the solution k to Mod[24k,11^n]==1.
 * @author Sean A. Irvine
 */
public class A052465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052465() {
    super(new long[] {-121, 121, 1}, new long[] {6, 116, 721});
  }
}
