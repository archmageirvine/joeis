package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167191.
 * @author Sean A. Irvine
 */
public class A167191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167191() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2664, 20568, 68592, 161616});
  }
}
