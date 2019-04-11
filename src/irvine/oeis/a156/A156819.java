package irvine.oeis.a156;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicIntArray;

import java.util.HashSet;

/**
 * A156819 Last digit d of <code>a(n)</code> is present in a(n+1+d); <code>a(1)=0</code>; <code>a(n+1)</code> is always the smallest available integer not already in the sequence and not leading to a contradiction.
 * @author Sean A. Irvine
 */
public class A156819 implements Sequence {

  private int mN = -1;
  private final DynamicIntArray mRequire = new DynamicIntArray();
  private final HashSet<Long> mUsed = new HashSet<>();

  @Override
  public Z next() {
    ++mN;
    long v = -1;
    final int require = mRequire.get(mN);
    while (true) {
      if (mUsed.contains(++v)) {
        continue;
      }
      final String s = String.valueOf(v);
      int r = require;
      char a = '0';
      boolean ok = true;
      while (ok && r != 0) {
        if ((r & 1) == 1 && s.indexOf(a) == -1) {
          ok = false;
          break;
        }
        r >>>= 1;
        ++a;
      }
      if (ok) {
        break;
      }
    }
    mUsed.add(v);
    final int d = (int) (v % 10);
    final int index = mN + 1 + d;
    mRequire.set(index, mRequire.get(index) | (1 << d));
    return Z.valueOf(v);
  }
}
