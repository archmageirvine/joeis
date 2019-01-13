package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * A002048.
 * @author Sean A. Irvine
 */
public class A002048 implements Sequence {

  private final HashSet<Long> mExcluded = new HashSet<>();
  private final ArrayList<Long> mA = new ArrayList<>();
  private long mV = 0;

  @Override
  public Z next() {
    while (mExcluded.remove(++mV)) {
      // do nothing
    }
    mA.add(mV);
    long s = 0;
    for (int i = mA.size() - 1; i >= 0; --i) {
      s += mA.get(i);
      mExcluded.add(s);
    }
    return Z.valueOf(mA.get(mA.size() - 1));
  }
}
