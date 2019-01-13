package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083294.
 * @author Sean A. Irvine
 */
public class A083294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083294() {
    super(new long[] {9, -8}, new long[] {1, -1});
  }
}
