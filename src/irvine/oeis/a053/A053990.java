package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053990 Numbers of the form x*(x + 1)*y*(y + 1) ("bipronics") where x and y are distinct.
 * @author Sean A. Irvine
 */
public class A053990 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
  }
  private long mN = 2;
  private Z mT = Z.valueOf(12);

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mT) >= 0) {
      final Z a = Z.valueOf(mN).multiply(mN + 1);
      for (long k = 1; k < mN; ++k) {
        mA.add(a.multiply(k).multiply(k + 1));
      }
      mT = Z.valueOf(++mN).multiply(mN + 1).multiply2();
    }
    return mA.pollFirst();
  }
}
