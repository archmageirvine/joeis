package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018214.
 * @author Sean A. Irvine
 */
public class A018214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018214() {
    super(new long[] {1, -6, 10, 10, -50, 34, 66, -110, 0, 110, -66, -34, 50, -10, -10, 6}, new long[] {1, 6, 36, 146, 511, 1512, 4032, 9752, 21942, 46252, 92504, 176484, 323554, 572264, 981024, 1634776});
  }
}
