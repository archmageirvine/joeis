package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036552 List of pairs (m,2m) where m is the least unused positive number.
 * @author Sean A. Irvine
 */
public class A036552 implements Sequence {

  private final TreeSet<Long> mUsed = new TreeSet<>();
  private long mA = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (mA != 0) {
      // return second member of previous pair
      final Z res = Z.valueOf(mA);
      mA = 0;
      return res;
    }
    while (mUsed.remove(++mN)) {
      // do nothing, mN already used
    }
    mA = mN * 2;
    mUsed.add(mA);
    return Z.valueOf(mN);
  }
}
