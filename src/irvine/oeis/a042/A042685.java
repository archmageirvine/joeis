package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042685 Denominators of continued fraction convergents to sqrt(872).
 * @author Sean A. Irvine
 */
public class A042685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042685() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 252006, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 15, 17, 236, 253, 2007, 2260, 4267, 249746, 254013, 503759, 3780326, 4284085, 59473431, 63757516, 505776043, 569533559, 1075309602});
  }
}
