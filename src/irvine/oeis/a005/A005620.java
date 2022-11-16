package irvine.oeis.a005;

import java.util.TreeSet;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.util.Pair;

/**
 * A005620 Spiral sieve using Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A005620 extends A000045 {

  static Z xyToUlamSpiral(final Z px, final Z py) {
    Z x = px.abs();
    Z y = py.abs();
    if (x.compareTo(y) > 0) {
      y = px.add(py);
      y = y.abs().add(x.multiply(x).shiftLeft(2)).add(1);
      x = x.multiply2();
      return px.signum() > 0 ? y.subtract(x.multiply2()) : y;
    } else {
      x = y;
      y = px.subtract(py);
      y = y.abs().add(x.multiply(x).shiftLeft(2)).add(1);
      x = x.multiply2();
      return py.signum() > 0 ? y.subtract(x) : y.add(x);
    }
  }

  private static Pair<Z, Z> getPowerOfI(final Z p) {
    switch ((int) (p.mod(4))) {
      case 0:
        return GaussianIntegers.SINGLETON.one();
      case 1:
        return GaussianIntegers.SINGLETON.i();
      case 2:
        return GaussianIntegers.SINGLETON.negate(GaussianIntegers.SINGLETON.one());
      default:
        return GaussianIntegers.SINGLETON.negate(GaussianIntegers.SINGLETON.i());
    }
  }

  static Pair<Z, Z> ulamSpiralToXY(final Z n) {
    final Z m = n.subtract(1);
    final Z p = m.shiftLeft(2).add(1).sqrt();
    final Z q = m.subtract(p.multiply(p).shiftRight(2));
    final Pair<Z, Z> pi = getPowerOfI(p.add(2));
    final Z re = p.add(2).shiftRight(2);
    final Z im = q.subtract(p.add(1).shiftRight(2));
    final Pair<Z, Z> ab = new Pair<>(re, im);
    return GaussianIntegers.SINGLETON.multiply(ab, pi);
  }

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
      final Pair<Z, Z> pos = ulamSpiralToXY(t);
      mNotYetReturned.add(xyToUlamSpiral(pos.right().negate(), pos.left())); // i.e. rotate by 90 degrees
      if (mNotYetReturned.first().square().compareTo(t) <= 0) {
        return mNotYetReturned.pollFirst();
      }
    }
  }

}

