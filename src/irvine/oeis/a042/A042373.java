package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042373 Denominators of continued fraction convergents to sqrt(713).
 * @author Sean A. Irvine
 */
public class A042373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042373() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10572734, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 7, 10, 47, 292, 631, 4078, 16943, 21021, 58985, 138991, 197976, 10433743, 10631719, 31697181, 74026081, 105723262, 496919129, 3087238036L, 6671395201L, 43115609242L, 179133832169L, 222249441411L, 623632714991L, 1469514871393L, 2093147586384L});
  }
}
