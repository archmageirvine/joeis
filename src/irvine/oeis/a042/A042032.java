package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042032 Numerators of continued fraction convergents to <code>sqrt(540)</code>.
 * @author Sean A. Irvine
 */
public class A042032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042032() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 238142, 0, 0, 0, 0, 0, 0, 0}, new long[] {23, 93, 395, 488, 5275, 5763, 28327, 119071, 5505593, 22141443, 94071365, 116212808, 1256199445, 1372412253, 6745848457L, 28355806081L});
  }
}
