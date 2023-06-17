package irvine.oeis.a056;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A056073 Number of 7-element ordered antichains on an unlabeled n-element set; T_1-hypergraphs with 7 labeled nodes and n hyperedges.
 * @author Sean A. Irvine
 */
public class A056073 extends AbstractSequence {

  /** Construct the sequence. */
  public A056073() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 127, 127)
      .subtract(Binomial.binomial(mN + 95, 95).multiply(42))
      .add(Binomial.binomial(mN + 79, 79).multiply(210))
      .add(Binomial.binomial(mN + 71, 71).multiply(140))
      .add(Binomial.binomial(mN + 67, 67).multiply(210))
      .subtract(Binomial.binomial(mN + 65, 65).multiply(84))
      .add(Binomial.binomial(mN + 64, 64).multiply(14))
      .subtract(Binomial.binomial(mN + 63, 63).multiply(819))
      .subtract(Binomial.binomial(mN + 59, 59).multiply(2520))
      .add(Binomial.binomial(mN + 55, 55).multiply(2730))
      .add(Binomial.binomial(mN + 53, 53).multiply(840))
      .add(Binomial.binomial(mN + 51, 51).multiply(840))
      .subtract(Binomial.binomial(mN + 50, 50).multiply(420))
      .add(Binomial.binomial(mN + 49, 49).multiply(2940))
      .add(Binomial.binomial(mN + 47, 47).multiply(630))
      .subtract(Binomial.binomial(mN + 45, 45).multiply(5040))
      .add(Binomial.binomial(mN + 44, 44).multiply(840))
      .subtract(Binomial.binomial(mN + 43, 43).multiply(1260))
      .add(Binomial.binomial(mN + 42, 42).multiply(1680))
      .subtract(Binomial.binomial(mN + 41, 41).multiply(9660))
      .add(Binomial.binomial(mN + 40, 40).multiply(1260))
      .add(Binomial.binomial(mN + 39, 39).multiply(3360))
      .subtract(Binomial.binomial(mN + 38, 38).multiply(7560))
      .add(Binomial.binomial(mN + 37, 37).multiply(11130))
      .add(Binomial.binomial(mN + 36, 36).multiply(5880))
      .add(Binomial.binomial(mN + 35, 35).multiply(9240))
      .add(Binomial.binomial(mN + 34, 34).multiply(2982))
      .subtract(Binomial.binomial(mN + 33, 33).multiply(6300))
      .subtract(Binomial.binomial(mN + 32, 32).multiply(8652))
      .subtract(Binomial.binomial(mN + 31, 31).multiply(9905))
      .subtract(Binomial.binomial(mN + 30, 30).multiply(8400))
      .subtract(Binomial.binomial(mN + 29, 29).multiply(8540))
      .add(Binomial.binomial(mN + 28, 28).multiply(13860))
      .add(Binomial.binomial(mN + 27, 27).multiply(14490))
      .subtract(Binomial.binomial(mN + 26, 26).multiply(5040))
      .add(Binomial.binomial(mN + 25, 25).multiply(10500))
      .add(Binomial.binomial(mN + 24, 24).multiply(10080))
      .subtract(Binomial.binomial(mN + 23, 23).multiply(8120))
      .subtract(Binomial.binomial(mN + 22, 22).multiply(15050))
      .subtract(Binomial.binomial(mN + 21, 21).multiply(5040))
      .subtract(Binomial.binomial(mN + 20, 20).multiply(11340))
      .add(Binomial.binomial(mN + 19, 19).multiply(20580))
      .add(Binomial.binomial(mN + 18, 18).multiply(15750))
      .subtract(Binomial.binomial(mN + 17, 17).multiply(1540))
      .subtract(Binomial.binomial(mN + 16, 16).multiply(5810))
      .subtract(Binomial.binomial(mN + 15, 15).multiply(16485))
      .subtract(Binomial.binomial(mN + 14, 14).multiply(21420))
      .add(Binomial.binomial(mN + 13, 13).multiply(26250))
      .add(Binomial.binomial(mN + 12, 12).multiply(21000))
      .subtract(Binomial.binomial(mN + 11, 11).multiply(29820))
      .add(Binomial.binomial(mN + 10, 10).multiply(3500))
      .add(Binomial.binomial(mN + 9, 9).multiply(17640))
      .add(Binomial.binomial(mN + 8, 8).multiply(2940))
      .subtract(Binomial.binomial(mN + 7, 7).multiply(16016))
      .add(Binomial.binomial(mN + 6, 6).multiply(4410))
      .subtract(Binomial.binomial(mN + 5, 5).multiply(9744))
      .add(Binomial.binomial(mN + 4, 4).multiply(9744))
      .add(Binomial.binomial(mN + 3, 3).multiply(1764))
      .subtract(Binomial.binomial(mN + 2, 2).multiply(3528))
      .add(Binomial.binomial(mN + 1, 1).multiply(720));
  }
}
