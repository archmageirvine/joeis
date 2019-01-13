package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021604.
 * @author Sean A. Irvine
 */
public class A021604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021604() {
    super(new long[] {-210, 331, -141, 21}, new long[] {1, 21, 300, 3670});
  }
}
