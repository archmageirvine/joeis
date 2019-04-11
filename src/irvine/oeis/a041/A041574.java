package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041574 Numerators of continued fraction convergents to <code>sqrt(305)</code>.
 * @author Sean A. Irvine
 */
public class A041574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041574() {
    super(new long[] {-1, 0, 0, 0, 978, 0, 0, 0}, new long[] {17, 35, 227, 489, 16853, 34195, 222023, 478241});
  }
}
