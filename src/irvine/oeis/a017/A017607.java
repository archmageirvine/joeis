package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017607 <code>(12n+7)^3</code>.
 * @author Sean A. Irvine
 */
public class A017607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017607() {
    super(new long[] {-1, 4, -6, 4}, new long[] {343, 6859, 29791, 79507});
  }
}
