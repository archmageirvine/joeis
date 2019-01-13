package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265688.
 * @author Sean A. Irvine
 */
public class A265688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265688() {
    super(new long[] {-100, 1, 100}, new long[] {1, 111, 11101});
  }
}
