package irvine.oeis.a137;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A137283 Palindromic primes consisting only of 3's and two 2's.
 * @author Sean A. Irvine
 */
public class A137283 implements Sequence {

  private final ArrayList<Z> mCache = new ArrayList<>();

  private int mPositionInCache = 0;
  private int mLength = 4;

  @Override
  public Z next() {
    while (mPositionInCache >= mCache.size()) {
      mCache.clear();
      mPositionInCache = 0;
      ++mLength;
      final char[] buf = new char[mLength];
      for (int twoPosition = 0; twoPosition < buf.length / 2; ++twoPosition) {
        Arrays.fill(buf, '3');
        buf[twoPosition] = '2';
        buf[buf.length - 1 - twoPosition] = '2';
        final Z p = new Z(new String(buf));
        if (p.isProbablePrime()) {
          mCache.add(p);
        }
      }
      //      Collections.sort(mCache);
    }
    return mCache.get(mPositionInCache++);
  }

}

