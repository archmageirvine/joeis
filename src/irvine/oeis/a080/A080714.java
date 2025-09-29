package irvine.oeis.a080;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080714 a(n) is taken to be the (n-th)-smallest positive integer greater than a(n-1) that is consistent with the condition "n is a member of the sequence if and only if a(n) is odd.".
 * @author Sean A. Irvine
 */
public class A080714 extends Sequence1 {

  private final LinkedList<Z> mOdd = new LinkedList<>();
  private long mN = 0;
  private Z mA = Z.SIX;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mN == 2) {
      mOdd.add(Z.SIX);
      return Z.SIX;
    }
    if (mOdd.peekFirst().equals(mN)) {
      mOdd.removeFirst();
      mA = mA.setBit(0).add(2 * (mN - 1));
    } else {
      mA = mA.clearBit(0).add(2 * mN);
    }
    mOdd.add(mA);
    return mA;
  }
}
