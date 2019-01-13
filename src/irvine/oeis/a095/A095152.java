package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095152.
 * @author Sean A. Irvine
 */
public class A095152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095152() {
    super(new long[] {21, -31, 11}, new long[] {1, 32, 321});
  }
}
