package irvine.oeis.a064;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A064680 Halve every even number, double every odd number.
 * @author Sean A. Irvine
 */
public class A064680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064680() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 2, 1, 6});
  }
}
