package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098590.
 * @author Sean A. Irvine
 */
public class A098590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098590() {
    super(new long[] {1, 0, 0, 4}, new long[] {1, 4, 16, 64});
  }
}
