package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028037.
 * @author Sean A. Irvine
 */
public class A028037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028037() {
    super(new long[] {-864, 720, -210, 25}, new long[] {1, 25, 415, 5845});
  }
}
