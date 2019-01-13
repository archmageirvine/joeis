package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252004.
 * @author Sean A. Irvine
 */
public class A252004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252004() {
    super(new long[] {1, -1155, 1155}, new long[] {328, 378896, 437246040});
  }
}
