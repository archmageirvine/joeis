package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042462 Numerators of continued fraction convergents to <code>sqrt(759)</code>.
 * @author Sean A. Irvine
 */
public class A042462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042462() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1102, 0, 0, 0, 0, 0}, new long[] {27, 28, 55, 248, 303, 551, 30057, 30608, 60665, 273268, 333933, 607201});
  }
}
