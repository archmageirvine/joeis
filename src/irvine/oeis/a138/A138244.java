package irvine.oeis.a138;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A138244.
 * @author Sean A. Irvine
 */
public class A138244 implements Sequence {

  private final ArrayList<Z> mDifferences = new ArrayList<>();
  private Z mPrev = null;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.ONE;
    } else {
      Z t = mPrev;
      while (true) {
        t = t.add(1);
        final Z d = t.subtract(mPrev);
        if (Z.ONE.equals(t.gcd(d))) {
          boolean ok = true;
          for (final Z z : mDifferences) {
            if (d.equals(z) || !Z.ONE.equals(t.gcd(z))) {
              ok = false;
              break;
            }
          }
          if (ok) {
            mDifferences.add(d);
            mPrev = t;
            break;
          }
        }
      }
    }
    return mPrev;
  }
}

