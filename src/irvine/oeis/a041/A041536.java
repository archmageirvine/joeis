package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041536 Numerators of continued fraction convergents to sqrt(285).
 * @author Sean A. Irvine
 */
public class A041536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041536() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 4862, 0, 0, 0, 0, 0}, new long[] {16, 17, 135, 287, 2144, 2431, 79936, 82367, 656505, 1395377, 10424144, 11819521});
  }
}
