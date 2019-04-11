package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042630 Numerators of continued fraction convergents to <code>sqrt(845)</code>.
 * @author Sean A. Irvine
 */
public class A042630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042630() {
    super(new long[] {1, 0, 0, 0, 0, 24476, 0, 0, 0, 0}, new long[] {29, 407, 436, 843, 12238, 710647, 9961296, 10671943, 20633239, 299537289});
  }
}
