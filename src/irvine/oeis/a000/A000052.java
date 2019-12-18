package irvine.oeis.a000;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A000052 1-digit numbers arranged in alphabetical order, then the 2-digit numbers arranged in alphabetical order, then the 3-digit numbers, etc.
 * @author Sean A. Irvine
 */
public class A000052 implements Sequence {

  private int mLow = 0;
  private int mHigh = 10;
  private final TreeMap<String, Integer> mMap = new TreeMap<>();

  @Override
  public Z next() {
    if (mMap.isEmpty()) {
      if (mHigh < 0) {
        throw new UnsupportedOperationException();
      }
      for (int k = mLow; k < mHigh; ++k) {
        mMap.put(English.SINGLETON.toRawText(k), k);
      }
      mLow = mHigh;
      mHigh *= 10;
    }
    final Map.Entry<String, Integer> pair = mMap.firstEntry();
    mMap.remove(pair.getKey());
    return Z.valueOf(pair.getValue());
  }
}

