package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017006.
 * @author Sean A. Irvine
 */
public class A017006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017006() {
    super(new long[] {1, -3, 3}, new long[] {4, 81, 256});
  }
}
