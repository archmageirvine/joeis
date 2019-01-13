package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207809.
 * @author Sean A. Irvine
 */
public class A207809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207809() {
    super(new long[] {1, 1, -12, 4, 13, 2}, new long[] {10, 100, 370, 1970, 9040, 43990});
  }
}
