package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253922 Indices of centered pentagonal numbers <code>(A005891)</code> which are also octagonal numbers <code>(A000567)</code>.
 * @author Sean A. Irvine
 */
public class A253922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253922() {
    super(new long[] {1, -1, -482, 482, 1}, new long[] {1, 56, 297, 26752, 142913});
  }
}
