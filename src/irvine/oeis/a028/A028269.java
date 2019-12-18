package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A028269 Distinct even elements in 3-Pascal triangle <code>A028262</code> (by row).
 * @author Sean A. Irvine
 */
public class A028269 extends A028266 {

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
