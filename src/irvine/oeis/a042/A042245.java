package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042245 Denominators of continued fraction convergents to sqrt(648).
 * @author Sean A. Irvine
 */
public class A042245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042245() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 39202, 0, 0, 0, 0, 0}, new long[] {1, 2, 11, 68, 351, 770, 38851, 78472, 431211, 2665738, 13759901, 30185540});
  }
}
