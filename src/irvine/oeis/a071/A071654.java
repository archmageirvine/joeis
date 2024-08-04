package irvine.oeis.a071;

import irvine.math.cr.CR;
import irvine.math.z.Binomial;

/**
 * A071654 Inverse permutation to A071653.
 * @author Sean A. Irvine
 */
public class A071654 extends A071652 {

  /** Construct the sequence. */
  public A071654() {
    super(n -> Binomial.binomial(CR.valueOf(n.add(1).multiply2()).sqrt().add(CR.HALF).floor().add(1), 2).subtract(n.add(1)),
      n -> n.subtract(Binomial.binomial(CR.valueOf(n.add(1).multiply2()).sqrt().add(CR.HALF).floor(), 2)));
  }
}
