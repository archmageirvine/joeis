package irvine.oeis.a002;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002048 Segmented numbers, or prime numbers of measurement.
 * @author Sean A. Irvine
 */
public class A002048 extends AbstractSequence {

  /** Construct the sequence. */
  public A002048() {
    super(1);
  }

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
