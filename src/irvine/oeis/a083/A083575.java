package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083575.
 * @author Sean A. Irvine
 */
public class A083575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083575() {
    super(new long[] {-2, 3}, new long[] {6, 11});
  }
}
