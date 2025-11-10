package irvine.oeis.a389;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a390.A390148;

/**
 * A389940 Numbers k for which a sphere of radius k is a member of at least 1 set of 4 spheres of coprime positive integer radii which are tangent to a plane when arranged as mutually tangent to one another.
 * @author Sean A. Irvine
 */
public class A389940 extends A390148 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      step(mA);
      if (mA.first().equals(mN)) {
        return mA.pollFirst();
      }
    }
  }
}
