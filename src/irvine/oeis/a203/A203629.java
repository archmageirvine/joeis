package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203629 Indices of 10-gonal (decagonal) numbers which are also 9-gonal (nonagonal).
 * @author Sean A. Irvine
 */
public class A203629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203629() {
    super(new long[] {1, -899, 899}, new long[] {1, 551, 494461});
  }
}
