package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289255.
 * @author Sean A. Irvine
 */
public class A289255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289255() {
    super(new long[] {4, -9, 6}, new long[] {1, 11, 57});
  }
}
