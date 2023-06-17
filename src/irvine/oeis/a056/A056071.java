package irvine.oeis.a056;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A056071 Number of 6-element ordered antichains on an unlabeled n-element set; T_1-hypergraphs with 6 labeled nodes and n hyperedges.
 * @author Sean A. Irvine
 */
public class A056071 extends AbstractSequence {

  /* Construct the sequence. */
  public A056071() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 63, 63)
      .subtract(Binomial.binomial(mN + 47, 47).multiply(30))
      .add(Binomial.binomial(mN + 39, 39).multiply(120))
      .add(Binomial.binomial(mN + 35, 35).multiply(60))
      .add(Binomial.binomial(mN + 33, 33).multiply(60))
      .subtract(Binomial.binomial(mN + 32, 32).multiply(12))
      .subtract(Binomial.binomial(mN + 31, 31).multiply(345))
      .subtract(Binomial.binomial(mN + 29, 29).multiply(720))
      .add(Binomial.binomial(mN + 27, 27).multiply(810))
      .add(Binomial.binomial(mN + 26, 26).multiply(120))
      .add(Binomial.binomial(mN + 25, 25).multiply(480))
      .add(Binomial.binomial(mN + 24, 24).multiply(360))
      .subtract(Binomial.binomial(mN + 23, 23).multiply(480))
      .subtract(Binomial.binomial(mN + 22, 22).multiply(720))
      .subtract(Binomial.binomial(mN + 21, 21).multiply(240))
      .subtract(Binomial.binomial(mN + 20, 20).multiply(540))
      .add(Binomial.binomial(mN + 19, 19).multiply(1380))
      .add(Binomial.binomial(mN + 18, 18).multiply(750))
      .add(Binomial.binomial(mN + 17, 17).multiply(60))
      .subtract(Binomial.binomial(mN + 16, 16).multiply(210))
      .subtract(Binomial.binomial(mN + 15, 15).multiply(1535))
      .subtract(Binomial.binomial(mN + 14, 14).multiply(1820))
      .add(Binomial.binomial(mN + 13, 13).multiply(2250))
      .add(Binomial.binomial(mN + 12, 12).multiply(1800))
      .subtract(Binomial.binomial(mN + 11, 11).multiply(2820))
      .add(Binomial.binomial(mN + 10, 10).multiply(300))
      .add(Binomial.binomial(mN + 9, 9).multiply(2040))
      .add(Binomial.binomial(mN + 8, 8).multiply(340))
      .subtract(Binomial.binomial(mN + 7, 7).multiply(1815))
      .add(Binomial.binomial(mN + 6, 6).multiply(510))
      .subtract(Binomial.binomial(mN + 5, 5).multiply(1350))
      .add(Binomial.binomial(mN + 4, 4).multiply(1350))
      .add(Binomial.binomial(mN + 3, 3).multiply(274))
      .subtract(Binomial.binomial(mN + 2, 2).multiply(548))
      .add(Binomial.binomial(mN + 1, 1).multiply(120));
  }
}
