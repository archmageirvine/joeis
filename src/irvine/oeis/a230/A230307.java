package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230307.
 * @author Sean A. Irvine
 */
public class A230307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230307() {
    super(new long[] {1, -3, 3}, new long[] {3331, 1163, -727});
  }
}
