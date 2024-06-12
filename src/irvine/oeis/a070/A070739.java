package irvine.oeis.a070;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070655.
 * @author Sean A. Irvine
 */
public class A070739 extends Sequence1 {

  private int mN = -1;
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final Z t = Z.ONE.shiftLeft(++mN);
      for (long k = 0; k <= mN; ++k) {
        final Z u = t.add(Z.ONE.shiftLeft(k)).add(1);
        if (u.isProbablePrime()) {
          mA.add(u);
        }
      }
    }
    return mA.pollFirst();
  }
}
