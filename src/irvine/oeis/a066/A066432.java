package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066432 a(n) = 10^n mod n^10.
 * @author Georg Fischer
 */
public class A066432 extends Sequence1 {

  protected long mN;
  protected int mP1;
  protected Z mPz;

  /** Construct the sequence. */
  public A066432() {
    this(10);
  }

  /**
   * Generic constructor with parameters
   * @param p1
   */
  public A066432(final int p1) {
    mP1 = p1;
    mPz = Z.valueOf(mP1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mPz.pow(mN).mod(Z.valueOf(mN).pow(mP1));
  }
}
