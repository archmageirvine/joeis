package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;
import irvine.oeis.gf.GfSequence;

/**
 * A005933 Theta series of laminated lattice LAMBDA_9.
 * @author Sean A. Irvine
 */
public class A005933 extends GfSequence {

  private static Series<Q> build() {
    final Series<Q> e1 = SeriesParser.parse("eta(x)");
    final Series<Q> e2 = SeriesParser.parse("eta(x^2)");
    final Series<Q> e4 = SeriesParser.parse("eta(x^4)");
    final Series<Q> e8 = SeriesParser.parse("eta(x^8)");
    final Series<Q> e16 = SeriesParser.parse("eta(x^16)");
    return SQ.subtract(SQ.subtract(SQ.subtract(SQ.add(SQ.add(SQ.subtract(SQ.subtract(
                  SQ.divide(SQ.multiply(SQ.multiply(SQ.pow(e2, 12), SQ.pow(e4, 10)), Q.NINE), SQ.multiply(SQ.multiply(SQ.pow(e1, 8), SQ.pow(e8, 3)), SQ.pow(e16, 2))),
                  SQ.divide(SQ.multiply(SQ.multiply(SQ.multiply(SQ.pow(e2, 7), SQ.pow(e4, 10)), SQ.pow(e8, 2)), Q.SIX), SQ.multiply(SQ.pow(e1, 6), SQ.pow(e16, 4)))),
                SQ.divide(SQ.shift(SQ.multiply(SQ.multiply(SQ.pow(e2, 11), SQ.pow(e8, 10)), Q.valueOf(28)), 1), SQ.multiply(SQ.multiply(SQ.pow(e1, 6), SQ.pow(e4, 2)), SQ.pow(e16, 4)))),
              SQ.divide(SQ.shift(SQ.multiply(SQ.multiply(SQ.pow(e2, 11), SQ.pow(e8, 4)), Q.valueOf(40)), 2), SQ.pow(e1, 6))),
            SQ.divide(SQ.multiply(SQ.multiply(SQ.multiply(SQ.pow(e2, 2), SQ.pow(e4, 10)), SQ.pow(e8, 7)), Q.valueOf(62)), SQ.multiply(SQ.pow(e1, 4), SQ.pow(e16, 6)))),
          SQ.divide(SQ.shift(SQ.multiply(SQ.multiply(SQ.multiply(SQ.pow(e2, 10), SQ.pow(e8, 5)), SQ.pow(e16, 6)), Q.valueOf(256)), 5), SQ.multiply(SQ.pow(e1, 4), SQ.pow(e4, 8)))),
        SQ.divide(SQ.multiply(SQ.multiply(SQ.pow(e4, 10), SQ.pow(e8, 12)), Q.valueOf(64)), SQ.multiply(SQ.multiply(SQ.pow(e1, 2), SQ.pow(e2, 3)), SQ.pow(e16, 8)))),
      SQ.divide(SQ.shift(SQ.multiply(SQ.multiply(SQ.pow(e4, 12), SQ.pow(e8, 11)), Q.valueOf(128)), 1), SQ.multiply(SQ.pow(e2, 8), SQ.pow(e16, 6))));
  }

  /** Construct the sequence. */
  public A005933() {
    super(0, build());
  }
}
