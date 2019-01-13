package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072290.
 * @author Sean A. Irvine
 */
public class A072290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072290() {
    super(new long[] {-100, 220, -141, 22}, new long[] {1, 11, 192, 2893});
  }
}
