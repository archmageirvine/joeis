package irvine.oeis.a338;
// manually simple/simbinom at 2023-03-20 17:26

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A338979 a(n) = Sum_{k=0..n} n^k * binomial(n,k) * Catalan(k).
 * @author Georg Fischer
 */
public class A338979 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A338979() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN, k -> Z.valueOf(mN).pow(k).multiply(Binomial.binomial(mN, k)).multiply(Binomial.catalan(k)));
  }
}
