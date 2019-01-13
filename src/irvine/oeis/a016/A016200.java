package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016200.
 * @author Sean A. Irvine
 */
public class A016200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016200() {
    super(new long[] {12, -20, 9}, new long[] {1, 9, 61});
  }
}
