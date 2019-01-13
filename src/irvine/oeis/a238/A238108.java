package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238108.
 * @author Sean A. Irvine
 */
public class A238108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238108() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 0, 0, 1, 19, 107, 386});
  }
}
