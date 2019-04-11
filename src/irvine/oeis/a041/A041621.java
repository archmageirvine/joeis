package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041621 Denominators of continued fraction convergents to <code>sqrt(329)</code>.
 * @author Sean A. Irvine
 */
public class A041621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041621() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4752830, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 7, 29, 65, 94, 159, 730, 889, 1619, 4127, 18127, 131016, 4734703, 33273937, 137830451, 308934839, 446765290, 755700129, 3469565806L, 4225265935L, 7694831741L, 19614929417L, 86154549409L, 622696775280L});
  }
}
