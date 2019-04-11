package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017583 <code>(12n+5)^3</code>.
 * @author Sean A. Irvine
 */
public class A017583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017583() {
    super(new long[] {-1, 4, -6, 4}, new long[] {125, 4913, 24389, 68921});
  }
}
