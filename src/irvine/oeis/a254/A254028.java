package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254028.
 * @author Sean A. Irvine
 */
public class A254028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254028() {
    super(new long[] {6, -11, 6}, new long[] {6, 10, 20});
  }
}
