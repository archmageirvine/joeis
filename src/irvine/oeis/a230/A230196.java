package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230196.
 * @author Sean A. Irvine
 */
public class A230196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230196() {
    super(new long[] {-1, -1, 0, 1, 1, 1, 1, 0, -1}, new long[] {0, 0, 0, 0, 0, 0, 1, 1, 1});
  }
}
