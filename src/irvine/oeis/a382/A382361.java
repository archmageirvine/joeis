package irvine.oeis.a382;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.oeis.a000.A000108;
import irvine.oeis.a103.A103970;
import irvine.oeis.gf.GfSequence;

/**
 * A382361 Number of nonnesting permutations of the multiset {1,1,2,2,...,n,n} that avoid 123.
 * @author Sean A. Irvine
 */
public class A382361 extends GfSequence {

  private static Series<Q> build() {
    final Series<Q> u1 = Series.create(new A103970().skip().prepend(2)); // U+1
    final Series<Q> v1 = Series.create(new A000108().skip().prepend(2)); // v+1
    final Series<Q> den = SQ.subtract(SQ.monomial(Q.TWO, 0), SQ.shift(SQ.multiply(u1, v1), 1));
    return SQ.add(SQ.shift(SQ.divide(u1, den), 1), SQ.one());
  }

  /** Construct the sequence. */
  public A382361() {
    super(0, build());
  }
}

