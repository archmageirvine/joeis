package irvine.oeis.a121;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A121022 Even numbers containing a 2 in their decimal representation.
 * @author Georg Fischer
 */
public class A121022 implements Sequence {

  private Z mN;
  private String mMultS;
  private int mMult;

  /** Construct the sequence. */
  public A121022() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param mult
   */
  public A121022(final int mult) {
    mN = Z.valueOf(-mult);
    mMult = mult;
    mMultS = String.valueOf(mult);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(mMult);
      if (mN.toString().indexOf(mMultS) >= 0) {
       return mN;
      }
    }
  }
}
