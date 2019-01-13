package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252003.
 * @author Sean A. Irvine
 */
public class A252003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252003() {
    super(new long[] {1, -1155, 1155}, new long[] {232, 267920, 309179640});
  }
}
