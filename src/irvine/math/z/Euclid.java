package irvine.math.z;

/**
 * Euclidean algorithm.
 *
 * @author Sean A. Irvine
 */
final class Euclid {

  private Euclid() { }

  /** Constants used by Euclid. */
  private static final double FHI = 1.0 + Div.EPSILON;
  private static final double FLO = 1.0 - Div.EPSILON;

  static int[] smallDiffEuclid(final Z a, final Z b) {
    int[] r = null;
    final int bSize = b.getSize();
    final int aSize = a.getSize();
    final int diff = aSize - bSize;
    if (diff == 0 || diff == 1) {
      final int[] aa = a.mValue;
      double num = (double) aa[aSize - 1] * Z.DBASE;
      if (aSize > 1) {
        num += aa[aSize - 2];
      }
      final int[] bb = b.mValue;
      double den = (double) bb[bSize - 1] * Z.DBASE;
      if (bSize > 1) {
        den += bb[bSize - 2];
      }
      double hi = FHI * (num + 1.0) / den;
      double lo = FLO * num / (den + 1.0);
      if (diff > 0) {
        hi *= Z.DBASE;
        lo *= Z.DBASE;
      }
      int try11 = 1;
      int try12 = 0;
      int try21 = 0;
      int try22 = 1;
      boolean parity = true;
      while (true) {
        parity ^= true;
        if (hi >= Z.DBASE) {
          break;
        } else {
          final int ilo = (int) lo;
          final double dirt = hi - ilo;
          if (dirt == 0 || ilo == 0 || ilo < (int) hi) {
            break;
          } else {
            final double dt = lo;
            lo = FLO / dirt;
            hi = dt > ilo ? FHI / (dt - ilo) : Z.DBASE;
            final int t1 = try11;
            try11 = try21;
            if ((Z.BASE - t1) / ilo < try21) {
              break;
            } else {
              try21 = t1 + ilo * try21;
            }
            final int t2 = try12;
            try12 = try22;
            if ((Z.BASE - t2) / ilo < try22) {
              break;
            } else {
              try22 = t2 + ilo * try22;
            }
            if (parity) {
              if (r == null) {
                r = new int[4];
              }
              r[0] = try11;
              r[1] = try12;
              r[2] = try21;
              r[3] = try22;
            }
          }
        }
      }
    }
    return r;
  }

  static Z[] euclid(final Z aIn, final Z bIn) {
    Z a = aIn;
    Z b = bIn;
    Z w = Z.ZERO;
    Z inv = Z.ONE;
    while (b.getSize() > 0) {
      final int[] sd = smallDiffEuclid(a, b);
      if (sd != null) {
        final Z t1 = inv.multiply(sd[2]);
        inv = inv.multiply(sd[0]).add(w.multiply(sd[1]));
        w = t1.add(w.multiply(sd[3]));
        final Z t2 = a.multiply(sd[2]);
        a = a.multiply(sd[0]).subtract(b.multiply(sd[1]));
        b = b.multiply(sd[3]).subtract(t2);
      } else {
        final Z[] qr = a.divideAndRemainder(b);
        a = qr[1];
        inv = qr[0].multiply(w).add(inv);
        if (a.getSize() > 0) {
          final Z[] qb = b.divideAndRemainder(a);
          b = qb[1];
          w = qb[0].multiply(inv).add(w);
        } else {
          return new Z[] {bIn.subtract(w), b};
        }
      }
    }
    return new Z[] {inv, a};
  }

}
