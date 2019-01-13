package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157506.
 * @author Sean A. Irvine
 */
public class A157506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157506() {
    super(new long[] {1, -3, 3}, new long[] {13447, 53137, 119071});
  }
}
