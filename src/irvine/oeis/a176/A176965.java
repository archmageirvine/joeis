package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176965.
 * @author Sean A. Irvine
 */
public class A176965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176965() {
    super(new long[] {-4, 4, 1}, new long[] {1, 0, 6});
  }
}
