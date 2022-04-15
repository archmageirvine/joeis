package irvine.oeis.a056;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056069 Number of 4-element ordered antichains on an unlabeled n-element set; T_1-hypergraphs with 4 labeled nodes and n hyperedges.
 * @author Sean A. Irvine
 */
public class A056069 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 15, 15)
      .subtract(Binomial.binomial(mN + 11, 11).multiply(12))
      .add(Binomial.binomial(mN + 9, 9).multiply(24))
      .add(Binomial.binomial(mN + 8, 8).multiply(4))
      .subtract(Binomial.binomial(mN + 7, 7).multiply(18))
      .add(Binomial.binomial(mN + 6, 6).multiply(6))
      .subtract(Binomial.binomial(mN + 5, 5).multiply(36))
      .add(Binomial.binomial(mN + 4, 4).multiply(36))
      .add(Binomial.binomial(mN + 3, 3).multiply(11))
      .subtract(Binomial.binomial(mN + 2, 2).multiply(22))
      .add(Binomial.binomial(mN + 1, 1).multiply(6));
  }
}

