package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A067779 Primes such that the sum of the squares of its digits is equal to the product of its digits.
 * @author Sean A. Irvine
 */
public class A067779 extends FilterSequence {

  /** Construct the sequence. */
  public A067779() {
    super(1, new A000040(), p -> Z.valueOf(ZUtils.digitSumSquares(p)).equals(ZUtils.digitProduct(p)));
  }
}
