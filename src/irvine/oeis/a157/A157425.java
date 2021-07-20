package irvine.oeis.a157;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A157425 Numbers which can be represented using fewer symbols than the number of decimal digits in the number.
 * @author Sean A. Irvine
 */
public class A157425 implements Sequence {

  private Z[] mCache = new Z[0];
  private int mCachePosition = 0;
  private int mLength = 2;

  private void solve3() {
    final HashSet<Z> s = new HashSet<>();
    int f = 1;
    int n = 2;
    while (f < 1000) {
      if (f >= 100) {
        s.add(Z.valueOf(f));
      }
      f *= n++;
    }
    for (int x = 2; x < 10; ++x) {
      int z = x;
      for (int y = 2; y < 10; ++y) {
        z *= x;
        if (z >= 100 && z < 1000) {
          s.add(Z.valueOf(z));
        }
      }
    }
    mCache = s.toArray(new Z[0]);
    Arrays.sort(mCache);
  }

  private void solve4() {
    final HashSet<Z> s = new HashSet<>();
    int f = 5040;
    int n = 8;
    while (f < 10000) {
      if (f >= 1000) {
        s.add(Z.valueOf(f));
      }
      f *= n++;
    }
    for (int x = 2; x < 100; ++x) {
      int z = x;
      for (int y = 2; y < 100; ++y) {
        z *= x;
        if (z >= 1000) {
          if (z < 10000) {
            s.add(Z.valueOf(z));
          } else {
            break;
          }
        }
      }
    }
    mCache = s.toArray(new Z[0]);
    Arrays.sort(mCache);
  }


  @Override
  public Z next() {
    if (mCachePosition >= mCache.length) {
      mCachePosition = 0;
      switch (++mLength) {
      case 3:
        solve3();
        break;
      case 4:
        solve4();
        break;
      default:
        throw new UnsupportedOperationException();
      }
    }
    return mCache[mCachePosition++];
  }
}

