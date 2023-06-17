package irvine.oeis.a056;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A056070 Number of 5-element ordered antichains on an unlabeled n-element set; T_1-hypergraphs with 5 labeled nodes and n hyperedges.
 * @author Sean A. Irvine
 */
public class A056070 extends AbstractSequence {

  /** Construct the sequence. */
  public A056070() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 31, 31)
      .subtract(Binomial.binomial(mN + 23, 23).multiply(20))
      .add(Binomial.binomial(mN + 19, 19).multiply(60))
      .add(Binomial.binomial(mN + 17, 17).multiply(20))
      .add(Binomial.binomial(mN + 16, 16).multiply(10))
      .subtract(Binomial.binomial(mN + 15, 15).multiply(110))
      .subtract(Binomial.binomial(mN + 14, 14).multiply(120))
      .add(Binomial.binomial(mN + 13, 13).multiply(150))
      .add(Binomial.binomial(mN + 12, 12).multiply(120))
      .subtract(Binomial.binomial(mN + 11, 11).multiply(240))
      .add(Binomial.binomial(mN + 10, 10).multiply(20))
      .add(Binomial.binomial(mN + 9, 9).multiply(240))
      .add(Binomial.binomial(mN + 8, 8).multiply(40))
      .subtract(Binomial.binomial(mN + 7, 7).multiply(205))
      .add(Binomial.binomial(mN + 6, 6).multiply(60))
      .subtract(Binomial.binomial(mN + 5, 5).multiply(210))
      .add(Binomial.binomial(mN + 4, 4).multiply(210))
      .add(Binomial.binomial(mN + 3, 3).multiply(50))
      .subtract(Binomial.binomial(mN + 2, 2).multiply(100))
      .add(Binomial.binomial(mN + 1, 1).multiply(24));
  }
}
