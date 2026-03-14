package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002313;
import irvine.util.array.DynamicArray;

/**
 * A084160 First occurrence prime gaps of the primes in sequence A002313 (Real primes with corresponding complex primes). a(0) = 2 with length of gap 3. For n&gt;0 the size of the gap in the sequence is 4n, a(n) is the starting prime of the gap.
 * @author Sean A. Irvine
 */
public class A084160 extends Sequence0 {

  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private final Sequence mS = new A002313();
  private Z mA = mS.next();
  private int mN = -1;
  {
    mFirsts.set(0, Z.TWO);
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z t = mA;
      mA = mS.next();
      final int d = mA.subtract(t).divide(4).intValueExact();
      if (mFirsts.get(d) == null) {
        mFirsts.set(d, t);
      }
    }
    return mFirsts.get(mN);
  }
}

