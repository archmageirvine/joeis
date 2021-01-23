package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155647 9^n+6^n-1^n.
 * @author Sean A. Irvine
 */
public class A155647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155647() {
    super(new long[] {54, -69, 16}, new long[] {1, 14, 116});
  }
}
