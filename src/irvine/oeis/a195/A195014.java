package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195014 Vertex number of a square spiral whose edges have length A195013.
 * @author Sean A. Irvine
 */
public class A195014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195014() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 2, 5, 9, 15});
  }
}
