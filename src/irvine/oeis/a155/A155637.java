package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155637 <code>10^n+5^n-1</code>.
 * @author Sean A. Irvine
 */
public class A155637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155637() {
    super(new long[] {50, -65, 16}, new long[] {1, 14, 124});
  }
}
