package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042353 Denominators of continued fraction convergents to sqrt(703).
 * @author Sean A. Irvine
 */
public class A042353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042353() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2318344, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 35, 177, 212, 1237, 21241, 22478, 43719, 2295866, 2339585, 4635451, 81142252, 410346711, 491488963, 2867791526L, 49243944905L, 52111736431L, 101355681336L});
  }
}
