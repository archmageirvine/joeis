package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118979.
 * @author Sean A. Irvine
 */
public class A118979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118979() {
    super(new long[] {6, -11, 6}, new long[] {12, 72, 300});
  }
}
