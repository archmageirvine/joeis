package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289837.
 * @author Sean A. Irvine
 */
public class A289837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289837() {
    super(new long[] {-8, 52, -146, 231, -225, 138, -52, 11}, new long[] {1, 1, 2, 16, 76, 261, 757, 2003});
  }
}
