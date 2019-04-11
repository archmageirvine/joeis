package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041382 Numerators of continued fraction convergents to <code>sqrt(206)</code>.
 * @author Sean A. Irvine
 */
public class A041382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041382() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 119070, 0, 0, 0, 0, 0, 0, 0}, new long[] {14, 29, 43, 244, 3459, 17539, 20998, 59535, 1687978, 3435491, 5123469, 29052836, 411863173, 2088368701, 2500231874L, 7088832449L});
  }
}
