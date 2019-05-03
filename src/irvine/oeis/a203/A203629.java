package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203629 Indices of <code>10-gonal (decagonal)</code> numbers which are also <code>9-gonal (nonagonal)</code>.
 * @author Sean A. Irvine
 */
public class A203629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203629() {
    super(new long[] {1, -899, 899}, new long[] {1, 551, 494461});
  }
}
