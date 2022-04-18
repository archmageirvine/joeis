package irvine.oeis.a056;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056231 Form an array with 3 rows: row 1 begins with 1; all rows are increasing; each entry is sum of 2 entries above it; each number appears at most once; smallest unused number is appended to first row if possible. Sequence gives row 1.
 * @author Sean A. Irvine
 */
public class A056231 implements Sequence {

  protected final long[] mA = new long[3];
  protected final TreeSet<Long> mUsed = new TreeSet<>();

  private boolean isOk(long s) {
    if (mUsed.contains(s)) {
      return false;
    }
    for (int k = 0; k < mA.length && mA[k] != 0; ++k) {
      s += mA[k];
      if (mUsed.contains(s)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mUsed.isEmpty()) {
      mA[0] = 1;
      mUsed.add(1L);
    } else {
      long s = mA[0];
      while (!isOk(++s)) {
        // do nothing
      }
      mUsed.add(s);
      for (int k = 0; k < mA.length; ++k) {
        final long t = mA[k];
        mA[k] = s;
        mUsed.add(s);
        s += t;
        if (t == 0) {
          break;
        }
      }
    }
    return Z.valueOf(mA[0]);
  }
}

