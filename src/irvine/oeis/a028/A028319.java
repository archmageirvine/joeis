package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A028319 Distinct odd elements in the 5-Pascal triangle <code>A028313</code>.
 * @author Sean A. Irvine
 */
public class A028319 extends A028315 {

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
