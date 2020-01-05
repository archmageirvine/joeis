package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A028332 Distinct elements to the right of the central elements of the even-Pascal triangle <code>A028326</code>.
 * @author Sean A. Irvine
 */
public class A028332 extends A028330 {

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
