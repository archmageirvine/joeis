package irvine.oeis.a014;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A014631.
 * @author Sean A. Irvine
 */
public class A014631 extends A007318 {

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
