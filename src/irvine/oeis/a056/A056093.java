package irvine.oeis.a056;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A056093 Number of 5-element ordered antichain covers of an unlabeled n-element set.
 * @author Sean A. Irvine
 */
public class A056093 extends AbstractSequence {

  /* Construct the sequence. */
  public A056093() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 30, 30)
      .subtract(Binomial.binomial(mN + 22, 22).multiply(20))
      .add(Binomial.binomial(mN + 18, 18).multiply(60))
      .add(Binomial.binomial(mN + 16, 16).multiply(20))
      .add(Binomial.binomial(mN + 15, 15).multiply(10))
      .subtract(Binomial.binomial(mN + 14, 14).multiply(110))
      .subtract(Binomial.binomial(mN + 13, 13).multiply(120))
      .add(Binomial.binomial(mN + 12, 12).multiply(150))
      .add(Binomial.binomial(mN + 11, 11).multiply(120))
      .subtract(Binomial.binomial(mN + 10, 10).multiply(240))
      .add(Binomial.binomial(mN + 9, 9).multiply(20))
      .add(Binomial.binomial(mN + 8, 8).multiply(240))
      .add(Binomial.binomial(mN + 7, 7).multiply(40))
      .subtract(Binomial.binomial(mN + 6, 6).multiply(205))
      .add(Binomial.binomial(mN + 5, 5).multiply(60))
      .subtract(Binomial.binomial(mN + 4, 4).multiply(210))
      .add(Binomial.binomial(mN + 3, 3).multiply(210))
      .add(Binomial.binomial(mN + 2, 2).multiply(50))
      .subtract(Binomial.binomial(mN + 1, 1).multiply(100))
      .add(Binomial.binomial(mN, 0).multiply(24));
  }
}
