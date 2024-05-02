package irvine.oeis.a064;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000930;

/**
 * A064105 2nd column of 3rd-order Zeckendorf array A136189.
 * @author Sean A. Irvine
 */
public class A064105 extends Sequence2 {

  // This is kind of like a skipping closure sequence

  private final Sequence mUnder;
  private final int mStep;
  private final TreeSet<Z> mA = new TreeSet<>();
  private final TreeMap<Z, Integer> mS = new TreeMap<>(); // value, next valid index
  private final Z mStart;
  private Z mNext;
  private int mTermNumber = 0;

  protected A064105(final Sequence under, final int order) {
    mUnder = under;
    mStep = order - 1;
    mStart = mUnder.next();
    mNext = mStart;
  }

  /** Construct the sequence. */
  public A064105() {
    this(new A000930().skip(3), 3);
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mNext) >= 0) {
      if (mStart.equals(mNext)) {
        mA.add(mNext);
        mS.put(mNext, mTermNumber + mStep);
      }
      final TreeMap<Z, Integer> additions = new TreeMap<>();
      for (final Map.Entry<Z, Integer> state : mS.entrySet()) {
        if (state.getValue() < mTermNumber) {
          final Z v = state.getKey().add(mNext);
          additions.put(v, mTermNumber + mStep);
          mA.add(v);
        }
      }
      mS.putAll(additions);
      mNext = mUnder.next();
      ++mTermNumber;
    }
    return mA.pollFirst();
  }
}
