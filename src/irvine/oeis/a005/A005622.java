package irvine.oeis.a005;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.a000.A000045;

/**
 * A005622 Spiral sieve using Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A005622 extends A000045 {

  {
    setOffset(1);
    super.next();
    super.next();
  }

  // Some reordering of entries is necessary
  private final TreeSet<Z> mNotYetReturned = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Zi pos = A005620.ulamSpiralToXY(t);
      mNotYetReturned.add(A005620.xyToUlamSpiral(pos.im(), pos.re().negate())); // i.e. rotate by 270 degrees
      if (mNotYetReturned.first().square().compareTo(t) <= 0) {
        return mNotYetReturned.pollFirst();
      }
    }
  }

}

