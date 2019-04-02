package irvine.oeis.a005;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.util.Pair;

/**
 * A005621 Spiral sieve using Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A005621 extends A000045 {

  {
    super.next();
    super.next();
  }

  // Some reordering of entries is necessary
  private final TreeSet<Z> mNotYetReturned = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Pair<Z, Z> pos = A005620.ulamSpiralToXY(t);
      mNotYetReturned.add(A005620.xyToUlamSpiral(pos.left().negate(), pos.right().negate())); // i.e. rotate by 180 degrees
      if (mNotYetReturned.first().square().compareTo(t) <= 0) {
        return mNotYetReturned.pollFirst();
      }
    }
  }

}

