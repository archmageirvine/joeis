package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042327 Denominators of continued fraction convergents to sqrt(690).
 * @author Sean A. Irvine
 */
public class A042327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042327() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2942, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 11, 15, 56, 2927, 8837, 11764, 32365, 44129, 164752});
  }
}
