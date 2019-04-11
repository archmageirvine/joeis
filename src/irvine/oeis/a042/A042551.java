package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042551 Denominators of continued fraction convergents to <code>sqrt(804)</code>.
 * @author Sean A. Irvine
 */
public class A042551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042551() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1030190, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 14, 31, 572, 1175, 5272, 6447, 18166, 1023743, 2065652, 3089395, 14423232, 31935859, 589268694, 1210473247, 5431161682L, 6641634929L, 18714431540L});
  }
}
