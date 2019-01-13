package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017261.
 * @author Sean A. Irvine
 */
public class A017261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017261() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {32768, 1419857, 11881376, 52521875, 164916224, 418195493});
  }
}
