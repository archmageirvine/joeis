package irvine.oeis.a074;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001597;

/**
 * A070049.
 * @author Sean A. Irvine
 */
public class A074499 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mPP = Z.ONE;

  @Override
  public Z next() {
    while (mA.isEmpty() || mPP.compareTo(mA.first()) <= 0) {
      final Sequence s = new A001597();
      Z u;
      do {
        u = s.next();
        final Z x = mPP.add(u);
        final Sequence t = new A001597();
        Z v;
        do {
          v = t.next();
          mA.add(x.add(v));
        } while (!v.equals(u));
      } while (!u.equals(mPP));
      mPP = s.next();
    }
    return mA.pollFirst();
  }
}
