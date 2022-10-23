package irvine.oeis.a053;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001223;

/**
 * A053597 Let prime(i) = i-th prime (A000040), let d(i) = prime(i+1)-prime(i) (A001223); a(n) = number of distinct numbers among d(n), d(n+1), d(n+2), ... before first duplicate is encountered.
 * @author Sean A. Irvine
 */
public class A053597 extends Sequence1 {

  private final Sequence mD = new A001223();
  private final LinkedList<Z> mA = new LinkedList<>();

  @Override
  public Z next() {
    int cnt = 0;
    while (true) {
      if (mA.size() <= cnt) {
        mA.add(mD.next());
      }
      final Z t = mA.get(cnt);
      boolean found = false;
      for (int c = 0; c < cnt; ++c) {
        if (mA.get(c).equals(t)) {
          found = true;
          break;
        }
      }
      if (found) {
        mA.remove(0);
        return Z.valueOf(cnt);
      }
      ++cnt;
    }
  }
}
