package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A028268 Distinct odd elements in 3-Pascal triangle <code>A028262</code> (by row).
 * @author Sean A. Irvine
 */
public class A028268 extends A028264 {

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
