package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098212.
 * @author Sean A. Irvine
 */
public class A098212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098212() {
    super(new long[] {-1, 5, 5}, new long[] {5, 25, 149});
  }
}
