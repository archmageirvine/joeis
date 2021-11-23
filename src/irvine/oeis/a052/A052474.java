package irvine.oeis.a052;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;

/**
 * A052456 Number of magic series of order n.
 * @author Sean A. Irvine
 */
public class A052474 implements Sequence {

  private final DynamicLongArray mA = new DynamicLongArray(); // trailing element of each row
  private final TreeSet<Long> mUsed = new TreeSet<>();

  private boolean isOk(long s) {
    if (mUsed.contains(s)) {
      return false;
    }
    for (int k = mA.length() - 1; k >= 0; --k) {
      s += mA.get(k);
      if (mUsed.contains(s)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mUsed.isEmpty()) {
      mA.set(0, 1L);
      mUsed.add(1L);
    } else {
      long s = mA.get(mA.length() - 1);
      while (!isOk(++s)) {
        // do nothing
      }
      mA.set(mA.length(), s);
      mUsed.add(s);
      for (int k = mA.length() - 2; k >= 0; --k) {
        s += mA.get(k);
        mA.set(k, s);
        mUsed.add(s);
      }
    }
    return Z.valueOf(mA.get(mA.length() - 1));
  }
}

