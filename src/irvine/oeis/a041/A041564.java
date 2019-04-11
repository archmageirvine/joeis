package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041564 Numerators of continued fraction convergents to <code>sqrt(300)</code>.
 * @author Sean A. Irvine
 */
public class A041564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041564() {
    super(new long[] {-1, 0, 0, 0, 2702, 0, 0, 0}, new long[] {17, 52, 433, 1351, 46367, 140452, 1169983, 3650401});
  }
}
