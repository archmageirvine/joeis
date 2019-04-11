package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017595 <code>(12n+6)^3</code>.
 * @author Sean A. Irvine
 */
public class A017595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017595() {
    super(new long[] {-1, 4, -6, 4}, new long[] {216, 5832, 27000, 74088});
  }
}
