package irvine.oeis.a000;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.AbstractLanguage;
import irvine.util.string.English;

/**
 * A000052 1-digit numbers arranged in alphabetical order, then the 2-digit numbers arranged in alphabetical order, then the 3-digit numbers, etc.
 * @author Sean A. Irvine
 */
public class A000052 extends Sequence1 {

  private int mLow = 0;
  private int mHigh = 10;
  private final AbstractLanguage mLanguage;
  private final TreeMap<String, Integer> mMap = new TreeMap<>();

  protected A000052(final AbstractLanguage language) {
    mLanguage = language;
  }

  /** Construct the sequence. */
  public A000052() {
    this(English.SINGLETON);
  }

  protected String remap(final String s) {
    return s;
  }

  @Override
  public Z next() {
    if (mMap.isEmpty()) {
      if (mHigh < 0) {
        throw new UnsupportedOperationException();
      }
      for (int k = mLow; k < mHigh; ++k) {
        mMap.put(remap(mLanguage.toRawText(k)), k);
      }
      mLow = mHigh;
      mHigh *= 10;
    }
    final Map.Entry<String, Integer> pair = mMap.firstEntry();
    mMap.remove(pair.getKey());
    return Z.valueOf(pair.getValue());
  }
}

