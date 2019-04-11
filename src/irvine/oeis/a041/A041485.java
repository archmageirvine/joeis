package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041485 Denominators of continued fraction convergents to <code>sqrt(259)</code>.
 * @author Sean A. Irvine
 */
public class A041485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041485() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1694450, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 10, 11, 32, 107, 460, 1487, 3434, 4921, 52644, 1689529, 16947934, 18637463, 54222860, 181306043, 779447032, 2519647139L, 5818741310L, 8338388449L, 89202625800L});
  }
}
