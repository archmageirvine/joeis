package irvine.math.z;

import irvine.math.LongUtils;

/**
 * Square root modulo.
 *
 * @author Sean A. Irvine
 */
final class ModSqrt {

  private ModSqrt() { }

  /**
   * Compute square roots modulo a prime.  Finds x such that <code>
   * x^2 = n(mod p)</code>.  When no solution is possible null
   * is returned.  The solution is computed using the Shanks-Tonelli
   * algorithm.  The argument given should be prime, if a composite
   * is given the algorithm may infinite loop.
   *
   * @param n number
   * @param p prime modulus
   * @return root or null
   */
  static Z modSqrt(final Z n, final Z p) {
    // Reduce argument modulo p in case it was larger
    if (p.getSize() <= 0) {
      return null;
    }
    final Z a = Mod.mod(n, p);
    if (a.getSize() == 0) {
      return Z.ZERO;
    }
    final int p0 = p.mValue[0];
    if ((p0 & 3) == 3) {
      // Quickly handle cases where p = 3 (mod 4)
      final Z x = ModPow.modPow(a, p.shiftRight(2).add(1L), p);
      return a.equals(x.modSquare(p)) ? x : null;
    } else if ((p0 & 7) == 5) {
      // Quickly handle cases where p = 5 (mod 8)
      final Z t = a.shiftLeft(1);
      final Z g = t.modPow(p.shiftRight(3), p);
      final Z x = a.modMultiply(g, p).modMultiply(t.modMultiply(g.modSquare(p), p).subtract(Z.ONE), p);
      return a.equals(x.modSquare(p)) ? x : null;
    } else if (a.jacobi(p) == -1) {
      // Check whether or not a solution actually exists
      return null;
    }
    final Z qq = p.subtract(Z.ONE);
    final Z q = qq.makeOdd();
    int r = (int) qq.mAuxiliary;
    // Find n such that (n|p)=-1
    int m = LongUtils.jacobi(p.mod(3L), 3);
    int z = 3;
    while (m != -1) {
      loop:
      while (true) {
        z += 2;
        if (z % 3 == 0) {
          z += 2;
        }
        for (int i = 5; i * i <= z; i += 4) {
          if (z % i == 0) {
            continue loop;
          }
          i += 2;
          if (z % i == 0) {
            continue loop;
          }
        }
        break;
      }
      m = LongUtils.jacobi(p.mod(z), z);
    }
    Z y = Z.valueOf(z).modPow(q, p);
    Z b = a.modPow(q.subtract(Z.ONE).divide2(), p);
    Z x = a.modMultiply(b, p);
    b = x.modMultiply(b, p);
    while (b.getSize() != 1 || b.mValue[0] != 1) {
      Z t = b.modSquare(p);
      m = 1;
      while (t.getSize() != 1 || t.mValue[0] != 1) {
        if (m == r) {
          return Z.ZERO;
        }
        t = t.modSquare(p);
        ++m;
      }
      t = y;
      for (int i = r - m - 1; i != 0; --i) {
        t = t.modSquare(p);
      }
      y = t.modSquare(p);
      r = m;
      x = x.modMultiply(t, p);
      b = b.modMultiply(y, p);
    }
    return x;
  }

}
