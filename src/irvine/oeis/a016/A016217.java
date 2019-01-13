package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016217.
 * @author Sean A. Irvine
 */
public class A016217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016217() {
    super(new long[] {36, -51, 16}, new long[] {1, 16, 205});
  }
}
