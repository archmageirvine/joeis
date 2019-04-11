package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157740 <code>18522n + 42</code>.
 * @author Sean A. Irvine
 */
public class A157740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157740() {
    super(new long[] {-1, 2}, new long[] {18564, 37086});
  }
}
