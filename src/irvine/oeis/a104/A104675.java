package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104675.
 * @author Sean A. Irvine
 */
public class A104675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104675() {
    super(new long[] {1, -3, 3}, new long[] {6, 14, 24});
  }
}
