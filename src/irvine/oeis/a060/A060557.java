package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060557.
 * @author Sean A. Irvine
 */
public class A060557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060557() {
    super(new long[] {1, -6, 5}, new long[] {1, 3, 10});
  }
}
