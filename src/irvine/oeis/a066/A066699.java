package irvine.oeis.a066;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A066699 Numbers n such that binomial(2n,n)+1 is prime.
 * @author Georg Fischer
 */
public class A066699 implements Sequence {

  private long mN;
  private final int mAdd;
  private final int mMult;

  /** Construct the sequence. */
  public A066699() {
    this(1, 2, 1);
  }

  /**
   * Generic constructor with parameters
   * @param start first number to be considered (0 or 1)
   * @param mult multiplicative factor
   * @param add additive term
   */
  public A066699(final int start, final int mult, final int add) {
    mN = start - 1;
    mMult = mult;
    mAdd = add;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Binomial.binomial(mMult * mN, mN).add(mAdd).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
