package irvine.oeis.a237;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A237054 a(1)=1, a(n) = (a(n-1) + n) XOR n.
 * @author Georg Fischer
 */
public class A237054 implements Sequence {

  private int mN = 0;
  private Z mAn1 = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN > 1) {
      mAn1 = mAn1.add(mN).xor(Z.valueOf(mN));
    }
    return mAn1;
  }
}
