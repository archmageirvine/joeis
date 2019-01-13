package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.TreeSet;

/**
 * A003072.
 * @author Sean A. Irvine
 */
public class A003072 implements Sequence {

  private final TreeSet<Z> mCubeRepresentable = new TreeSet<>();
  private long mN = 1;

  @Override
  public Z next() {
    Z cube = Z.valueOf(mN).pow(3);
    while (mCubeRepresentable.isEmpty() || mCubeRepresentable.first().compareTo(cube) >= 0) {
      for (long a = 1; a <= mN; ++a) {
        final Z a3 = Z.valueOf(a).pow(3);
        for (long b = a; b <= mN; ++b) {
          final Z b3 = Z.valueOf(b).pow(3);
          mCubeRepresentable.add(a3.add(b3).add(cube));
        }
      }
      ++mN;
      cube = Z.valueOf(mN).pow(3);
    }
    return mCubeRepresentable.pollFirst();
  }
}
