package irvine.oeis.a112;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A112798 Table where n-th row is factorization of n, with each prime p_i replaced by i.
 * @author Georg Fischer
 */
public class A112798 extends AbstractSequence {

  private int mN;
  private Z[] mFz;
  private FactorSequence mFs;
  private int mFi; // index in mFs
  private int mK; // counter for the same prime
  private Z mP; // current prime
  private Z mPi; // primePi of mP

  /** Construct the sequence. */
  public A112798() {
    super(2);
    mN = 1;
    mFz = new Z[0];
    mFi = 0;
    mK = 0;
  }

  @Override
  public Z next() {
    if (--mK > 0) {
      return mPi;
    }
    if (mFi < mFz.length) {
      mP = mFz[mFi++];
      mPi = Puma.primePiZ(mP);
      mK = mFs.getExponent(mP);
      return mPi;
    }
    mFs = Jaguar.factor(++mN);
    mFz = mFs.toZArray();
    mFi = 0;
    mP = mFz[mFi++];
    mPi = Puma.primePiZ(mP);
    mK = mFs.getExponent(mP);
    return mPi;
  }
}
