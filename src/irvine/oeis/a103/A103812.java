package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001622;

/**
 * A103812 Primes from merging of 2 successive digits in decimal expansion of the Golden Ratio, (1+sqrt(5))/2.
 * @author Georg Fischer
 */
public class A103812 extends Sequence1 {

  private final Sequence mSeq;
  private Z mA; // current result of merging
  private final Z mMod; // 10^mBlock
  private final Z mMin; // 10^(mBlock - 1)

  /** Construct the sequence. */
  public A103812() {
    this(new A001622(), 2, 1);
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence
   * @param block number of digits
   * @param var variant: 0 = with zeros, 1 = without zeros, 2 = erroneous
   */
  public A103812(final Sequence seq, final int block, final int var) {
    mSeq = seq;
    mA = Z.ZERO;
    mMin = var == 0 ? Z.ZERO : Z.TEN.pow(block - 1);
    mMod = Z.TEN.pow(block);
    for (int i = 1; i < block; ++i) {
      mA = mA.multiply(10).add(mSeq.next());
    }
  }

  @Override
  public Z next() {
    mA = mA.multiply(10).add(mSeq.next()).mod(mMod);
    while (mA.compareTo(mMin) < 0 || !mA.isProbablePrime()) {
      // System.out.println("mMin=" + mMin + ", mMod=" + mMod + ", mA=" + mA);
      mA = mA.multiply(10).add(mSeq.next()).mod(mMod);
    }
    return mA;
  }
}
