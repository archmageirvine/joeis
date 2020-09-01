package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A034791 a(n) is square mod a(i), i &lt; n.
 * @author Sean A. Irvine
 */
public class A034791 extends MemorySequence {

  // todo this isModSquare should be in ZUtils or similar
  private boolean isModSquare(final Z a, final Z mod) {
    if (mod.isProbablePrime()) {
      // Avoid factorization for prime cases
      return a.jacobi(mod) == 1;
    }
    if (a.jacobi(mod) == -1) {
      return false;
    }

//    final FactorSequence fs = Cheetah.factor(mod);
//    for (final Z p : fs.toZArray()) {
//      final int e = fs.getExponent(p);
//      if (Z.TWO.equals(p)) {
//        return a.mod(8) == 1 && e >= 3;
//      } else if (a.jacobi(p) != 1) {
//        return false;
//      }
//    }
//    return true;

    // todo this is crappy ...
    final Z lim = mod.divide2();
    for (Z x = Z.ZERO; x.compareTo(lim) <= 0; x = x.add(1)) {
      if (x.modSquare(mod).equals(a)) {
        return true;
      }
    }
    return false;
  }

  private boolean isSquares(final Z n) {
    for (final Z a : this) {
      if (!isModSquare(a, n)) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.ONE;
    }
    Z t = get(size() - 1);
    while (true) {
      t = t.add(1);
      if (isSquares(t)) {
        return t;
      }
    }
  }
}
