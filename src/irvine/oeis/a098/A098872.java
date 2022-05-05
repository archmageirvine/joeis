package irvine.oeis.a098;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A098872 Least k such that 2*((6*n)^k) + 1 is prime.
 * @author Georg Fischer
 */
public class A098872 implements Sequence {

  private int mN;
  private int mMult;
  private int mAdd;

  /** Construct the sequence. */
  public A098872() {
    this(2, 1);
  }

  /**
   * Generic constructor with parameters
   * @param mult
   * @param add
   */
  public A098872(final int mult, final int add) {
    mN = 0;
    mMult = mult;
    mAdd = add;
  }

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      ++k;
      if (Z.SIX.multiply(mN).pow(k).multiply(mMult).add(mAdd).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
