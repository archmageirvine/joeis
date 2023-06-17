package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A054648 Number of labeled pure 2-complexes on n nodes (0-simplexes) with 4 2-simplexes and 11 1-simplexes.
 * @author Sean A. Irvine
 */
public class A054648 extends AbstractSequence {

  /* Construct the sequence. */
  public A054648() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 6).multiply(360)
      .add(Binomial.binomial(mN, 7).multiply(10710))
      .add(Binomial.binomial(mN, 8).multiply(42000))
      .add(Binomial.binomial(mN, 9).multiply(41580))
      .add(Binomial.binomial(mN, 10).multiply(12600));
  }
}

