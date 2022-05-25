package irvine.oeis.a057;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057153 Construct difference array so that (1) first row begins with 1, (2) every row is monotonic increasing, (3) no number appears more than once, (4) smallest number not yet used begins a new row. Sequence gives first row of array.
 * @author Sean A. Irvine
 */
public class A057153 implements Sequence {

  protected final ArrayList<Long> mA = new ArrayList<>();
  protected final TreeSet<Long> mUsed = new TreeSet<>();

  private boolean isOk(long s) {
    if (mUsed.contains(s)) {
      return false;
    }
    for (int k = mA.size() - 1; k >= 0; --k) {
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
      mA.add(1L);
      mUsed.add(1L);
    } else {
      long s = mA.get(mA.size() - 1);
      while (!isOk(++s)) {
        // do nothing
      }
      mUsed.add(s);
      long t = s;
      for (int k = mA.size() - 1; k >= 0; --k) {
        t += mA.get(k);
        mA.set(k, t);
        mUsed.add(t);
      }
      mA.add(s);
    }
    return Z.valueOf(mA.get(0));
  }
}

