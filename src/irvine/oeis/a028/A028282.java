package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A028282 Distinct even elements in 4-Pascal triangle <code>A028275</code> (by row).
 * @author Sean A. Irvine
 */
public class A028282 extends A028279 {

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
