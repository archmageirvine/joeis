package irvine.oeis.a079;

import java.util.LinkedList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079256 a(n) is taken to be the smallest positive integer greater than a(n-1) which is consistent with the condition "n is a member of the sequence if and only if a(n) is a power of 2".
 * @author Sean A. Irvine
 */
public class A079256 extends Sequence1 {

  private static final long[] SMALL = {0, 1, 2, 5, 6, 8};
  private final LinkedList<Long> mT = new LinkedList<>();
  {
    mT.add(6L);
    mT.add(8L);
  }
  private long mN = 0;
  private Z mA = Z.EIGHT;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[(int) mN]);
    }
    if (mT.peekFirst() == mN) {
      mT.pop();
      mA = Functions.NEXT_POWER_OF_2.z(mA);
    } else {
      mA = mA.add(1);
    }
    if (mA.bitLength() < Long.SIZE) {
      mT.add(mA.longValueExact());
    }
    return mA;
  }
}

