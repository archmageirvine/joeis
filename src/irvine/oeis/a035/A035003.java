package irvine.oeis.a035;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a014.A014784;

/**
 * A035003 Sorted entries in triangle in A014784.
 * @author Sean A. Irvine
 */
public class A035003 extends A014784 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 1;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(get(mN, 1)) >= 0) {
      ++mN;
      for (int m = 1; m < mN; ++m) {
        mA.add(get(mN, m));
      }
    }
    return mA.pollFirst();
  }
}
