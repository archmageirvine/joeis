package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038845.
 * @author Sean A. Irvine
 */
public class A038845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038845() {
    super(new long[] {64, -48, 12}, new long[] {1, 12, 96});
  }
}
