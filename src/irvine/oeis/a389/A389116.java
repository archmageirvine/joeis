package irvine.oeis.a389;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389116 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A389116 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      mUsed.add(mA);
      return mA;
    } else {
      final int syn = Functions.SYNDROME.i(mA);
      int k = 1;
      while ((syn & (1 << k)) == 0) {
        ++k;
      }
      mA = Z.ZERO;
      while (true) {
        mA = mA.add(k);
        if (mUsed.add(mA)) {
          return mA;
        }
      }
    }
  }
}
