package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129346.
 * @author Sean A. Irvine
 */
public class A129346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129346() {
    super(new long[] {-1, 0, 6, 0}, new long[] {4, 5, 22, 29});
  }
}
