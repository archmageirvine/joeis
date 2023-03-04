package irvine.oeis.a057;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057153 Construct difference array so that (1) first row begins with 1, (2) every row is monotonic increasing, (3) no number appears more than once, (4) smallest number not yet used begins a new row. Sequence gives first row of array.
 * @author Sean A. Irvine
 */
public class A057153 extends Sequence1 {

  protected final ArrayList<Z> mA = new ArrayList<>();
  protected final TreeSet<Z> mUsed = new TreeSet<>();

  private boolean isOk(Z s) {
    if (mUsed.contains(s)) {
      return false;
    }
    for (int k = mA.size() - 1; k >= 0; --k) {
      s = s.add(mA.get(k));
      if (mUsed.contains(s)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mUsed.isEmpty()) {
      mA.add(Z.ONE);
      mUsed.add(Z.ONE);
    } else {
      Z s = mA.get(mA.size() - 1);
      do {
        s = s.add(1);
      } while (!isOk(s));
      mUsed.add(s);
      Z t = s;
      for (int k = mA.size() - 1; k >= 0; --k) {
        t = t.add(mA.get(k));
        mA.set(k, t);
        mUsed.add(t);
      }
      mA.add(s);
    }
    return mA.get(0);
  }
}

