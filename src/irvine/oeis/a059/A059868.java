package irvine.oeis.a059;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a002.A002069;

/**
 * A059868 There exist no palindromic pentagonal numbers of length a(n).
 * @author Sean A. Irvine
 */
public class A059868 extends A002069 {

  private int mA = super.next().toString().length();
  private final TreeSet<Integer> mQ = new TreeSet<>();

  @Override
  public Z next() {
    while (mQ.isEmpty()) {
      final int old = mA;
      mA = super.next().toString().length();
      for (int skipped = old + 1; skipped < mA; ++skipped) {
        mQ.add(skipped);
      }
    }
    return Z.valueOf(mQ.pollFirst());
  }
}
