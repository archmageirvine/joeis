package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104487.
 * @author Sean A. Irvine
 */
public class A104487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104487() {
    super(new long[] {3, -10, 6}, new long[] {1, 4, 14});
  }
}
