package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021784.
 * @author Sean A. Irvine
 */
public class A021784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021784() {
    super(new long[] {-220, 339, -139, 21}, new long[] {1, 21, 302, 3762});
  }
}
