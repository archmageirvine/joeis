package irvine.oeis.a075;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A075689 Even interprimes from A075688.
 * @author Sean A. Irvine
 */
public class A075689 extends A075688 {

  private final TreeSet<Z> mT = new TreeSet<>();

  @Override
  public Z next() {
    while (mT.isEmpty() || mT.first().compareTo(mN) >= 0) {
      super.next();
      final Z t = mA.get(mA.size() - 1);
      for (final Z v : mA) {
        if (!v.equals(t)) {
          mT.add(t.add(v));
        }
      }
    }
    return mT.pollFirst();
  }
}
