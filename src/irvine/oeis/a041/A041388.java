package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041388 Numerators of continued fraction convergents to <code>sqrt(209)</code>.
 * @author Sean A. Irvine
 */
public class A041388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041388() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 93102, 0, 0, 0, 0, 0, 0, 0}, new long[] {14, 29, 159, 506, 1171, 4019, 21266, 46551, 1324694, 2695939, 14804389, 47109106, 109022601, 374176909, 1979907146, 4333991201L});
  }
}
