package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228292 <code>a(n) =</code> Sum_{k=1..8} <code>n^k</code>.
 * @author Sean A. Irvine
 */
public class A228292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228292() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 8, 510, 9840, 87380, 488280, 2015538, 6725600, 19173960});
  }
}
