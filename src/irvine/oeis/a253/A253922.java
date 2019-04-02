package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253922 Indices of centered pentagonal numbers (A005891) which are also octagonal numbers (A000567).
 * @author Sean A. Irvine
 */
public class A253922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253922() {
    super(new long[] {1, -1, -482, 482, 1}, new long[] {1, 56, 297, 26752, 142913});
  }
}
