package irvine.oeis.a084;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A084699 Composite numbers j such that binomial(2*j,j) == 2^j (mod j).
 * @author Sean A. Irvine
 */
public class A084699 extends FilterSequence {

  /** Construct the sequence. */
  public A084699() {
    super(1, new A002808(), k -> Binomial.binomial(k.multiply2(), k, k).equals(Z.TWO.modPow(k, k)));
  }
}
