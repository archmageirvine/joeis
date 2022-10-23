package irvine.oeis.a052;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A052474 Construct difference array so that (1) first row begins with 1, (2) every row is monotonic increasing, (3) no number appears more than once, (4) smallest number not yet used begins a new row. Sequence gives main diagonal.
 * @author Sean A. Irvine
 */
public class A052474 extends Sequence1 {

  protected final DynamicLongArray mA = new DynamicLongArray(); // trailing element of each row
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

