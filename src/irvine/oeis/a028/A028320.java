package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A028320 Distinct even elements in the 5-Pascal triangle <code>A028313</code>.
 * @author Sean A. Irvine
 */
public class A028320 extends A028317 {

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
