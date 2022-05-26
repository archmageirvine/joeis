package irvine.oeis.a190;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A190016 Numbers 1 through 10000 sorted lexicographically in decimal representation.
 * @author Georg Fischer
 */
public class A190016 implements Sequence {

  private long mN;
  private int mMode;
  private int mBase;
  private long mLimit;
  private TreeMap<String, String> mMap;
  private static final String SPACES = "                                "; // 32 spaces

  /** Construct the sequence. */
  public A190016() {
    this(1, 10, 10000);
  }

  /**
   * Generic constructor with parameters.
   * @param mode 1 = sorted lexicographically, 2 = inverse permutation
   * @param base number base from 2 to 16
   * @param limit number of elements to be sorted
   */
  public A190016(final int mode, final int base, final long limit) {
    mN = 0;
    mMode = mode;
    mBase = base;
    mLimit = limit;
    mMap = new TreeMap<>();
    for (long i = 1; i <= mLimit; ++i) {
      final String nstr = Long.toString(i, mBase);
      mMap.put(nstr, nstr);
    }
    if (mMode == 2) {
      final TreeMap<String, String> map2 = new TreeMap<>();
      long k = 0;
      while (!mMap.isEmpty()) {
        ++k;
        final String kstr = Long.toString(k, mBase);
        final String nstr = mMap.pollFirstEntry().getKey();
        map2.put(SPACES.substring(0, 32 - kstr.length()) + kstr, nstr);
      }
      for (long i = 1; i <= mLimit; ++i) {
        final String kstr = Long.toString(i, mBase);
        final String nstr = map2.pollFirstEntry().getValue();
        mMap.put(SPACES.substring(0, 32 - nstr.length()) + nstr, kstr);
      }
    }
  }

  @Override
  public Z next() {
    final String nstr = mMap.pollFirstEntry().getValue();
    return nstr == null ? Z.ZERO : new Z(nstr, mBase);
  }
}
