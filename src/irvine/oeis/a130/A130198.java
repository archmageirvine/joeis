package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130198 Single paradiddle. In percussion, the paradiddle is a four-note drum sticking pattern consisting of two alternating notes followed by two notes on the same hand.
 * @author Sean A. Irvine
 */
public class A130198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130198() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {0, 1, 0, 0, 1});
  }
}
