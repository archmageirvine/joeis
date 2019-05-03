package irvine.oeis.a014;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a008.A008292;

/**
 * A014630 Distinct elements occurring in triangle of Eulerian numbers <code>(unsorted)</code>.
 * @author Sean A. Irvine
 */
public class A014630 extends A008292 {

  private final TreeSet<Z> mSeen = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (mSeen.add(a)) {
        return a;
      }
    }
  }
}
