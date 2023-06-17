package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A054647 Number of labeled pure 2-complexes on n nodes (0-simplexes) with 4 2-simplexes and 12 1-simplexes.
 * @author Sean A. Irvine
 */
public class A054647 extends AbstractSequence {

  /** Construct the sequence. */
  public A054647() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 6).multiply(30)
      .add(Binomial.binomial(mN, 7).multiply(2100))
      .add(Binomial.binomial(mN, 8).multiply(25200))
      .add(Binomial.binomial(mN, 9).multiply(86625))
      .add(Binomial.binomial(mN, 10).multiply(116550))
      .add(Binomial.binomial(mN, 11).multiply(69300))
      .add(Binomial.binomial(mN, 12).multiply(15400));
  }
}
