package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052466 <code>a(n)</code> is the solution k to <code>Mod[24k,13^n]==1</code>.
 * @author Sean A. Irvine
 */
public class A052466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052466() {
    super(new long[] {-169, 169, 1}, new long[] {6, 162, 1007});
  }
}
