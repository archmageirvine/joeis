package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128786.
 * @author Sean A. Irvine
 */
public class A128786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128786() {
    super(new long[] {343, -147, 21}, new long[] {0, 7, 196});
  }
}
