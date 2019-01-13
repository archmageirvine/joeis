package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224426.
 * @author Sean A. Irvine
 */
public class A224426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224426() {
    super(new long[] {128, -288, 232, -86, 15}, new long[] {68556, 2138994, 27959412, 251530740, 1844957748});
  }
}
