package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042039 Denominators of continued fraction convergents to <code>sqrt(543)</code>.
 * @author Sean A. Irvine
 */
public class A042039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042039() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1338674, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 10, 33, 43, 635, 678, 2669, 8685, 28724, 1329989, 4018691, 13386062, 44176877, 57562939, 850058023, 907620962, 3572920909L, 11626383689L, 38452071976L});
  }
}
