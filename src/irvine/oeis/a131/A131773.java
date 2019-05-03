package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131773 Epact in Julian calendar for a year n with Golden Number <code>(n mod 19) + 1 = A074805(n)</code>.
 * @author Sean A. Irvine
 */
public class A131773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131773() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {30, 11, 22, 3, 14, 25, 6, 17, 28, 9, 20, 1, 12, 23, 4, 15, 26, 7, 18});
  }
}
