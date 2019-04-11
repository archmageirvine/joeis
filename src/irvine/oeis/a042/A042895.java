package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042895 Denominators of continued fraction convergents to <code>sqrt(979)</code>.
 * @author Sean A. Irvine
 */
public class A042895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042895() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 720898, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 7, 38, 45, 218, 263, 1533, 3329, 11520, 717569, 2164227, 5046023, 27394342, 32440365, 157155802, 189596167, 1105136637, 2399869441L, 8304744960L});
  }
}
