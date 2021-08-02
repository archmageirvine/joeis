package irvine.oeis.a049;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.a121.A121657;

/**
 * A049523 Smallest starting index for a run of exactly n consecutive equal digits in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A049523 extends A121657 {

  private final HashMap<Z, Z> mFirstOccurrences = new HashMap<>();
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    mM = mM.add(1);
    while (mFirstOccurrences.get(mM) == null) {
      final Z run = super.next();
      if (mFirstOccurrences.get(run) == null) {
        mFirstOccurrences.put(run, Z.valueOf(mN).subtract(run));
      }
    }
    return mFirstOccurrences.get(mM);
  }
}

