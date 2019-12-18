package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A028280 Distinct elements in 4-Pascal triangle <code>A028275</code> (by row).
 * @author Sean A. Irvine
 */
public class A028280 extends A028275 {

  private final TreeSet<Z> mSeen = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mSeen.add(t)) {
        return t;
      }
    }
  }
}
