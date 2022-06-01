package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259210 Positive hexagonal numbers (A000384) that are other hexagonal numbers divided by 3.
 * @author Sean A. Irvine
 */
public class A259210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259210() {
    super(new long[] {1, -37635, 37635}, new long[] {15, 567645, 21362755051L});
  }
}
