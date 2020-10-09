package irvine.math.lattice;

import java.util.HashSet;

import irvine.math.LongUtils;

/**
 * Four-dimensional londsdaleite.
 * @author Sean A. Irvine
 */
class Lonsdaleite4 extends Z4Lattice {

  @Override
  public int neighbourCount(final long point) {
    return 5;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    // todo close but no cigar
    switch (neighbourNumber) {
      case 0:
        return point + 1;
      case 1:
        return point - 1;
      case 2:
        final long t2 = ordinate(point, 0);
        final long x2 = ordinate(point, 1);
        //final long y2 = ordinate(point, 2);
        //final long z2 = ordinate(point, 3);
        return point + ((2 * ((1 + t2 + x2) & 1) - 1) << BITS_PER_COORDINATE);
      case 3:
        final long t3 = ordinate(point, 0);
        final long x3 = ordinate(point, 1);
        final long y3 = ordinate(point, 2);
        //final long z3 = ordinate(point, 3);
        return point + ((2 * ((1 + t3 + x3 + y3) & 1) - 1) << Y_SHIFT);
      default:
        final long t4 = ordinate(point, 0);
        final long x4 = ordinate(point, 1);
        final long y4 = ordinate(point, 2);
        final long z4 = ordinate(point, 3);
        return point + ((2 * ((1 + t4 + x4 + y4 + z4) & 1) - 1) << Z_SHIFT);
    }
  }

  @Override
  public long distanceBound(final long point) {
    final long t = Math.abs(ordinate(point, 0));
    final long x = Math.abs(ordinate(point, 1));
    final long y = Math.abs(ordinate(point, 2));
    final long z = Math.abs(ordinate(point, 3));
    return LongUtils.max(t, x / 2, y / 2, z / 2);
  }

  public static void main(final String... args) {
    final Lattice lons = new Lonsdaleite4();
    final HashSet<Long> seen = new HashSet<>();
    HashSet<Long> next = new HashSet<>();
    next.add(ORIGIN);
    seen.add(ORIGIN);
    while (true) {
      final HashSet<Long> prev = next;
      next = new HashSet<>();
      for (final long pt : prev) {
        //System.out.println("Expanding: " + lons.toString(pt));
        for (int k = 0; k < lons.neighbourCount(pt); ++k) {
          final long p = lons.neighbour(pt, k);
          if (seen.add(p)) {
            next.add(p);
          }
        }
      }
      for (final long p : next) {
        System.out.println(lons.toString(p));
      }
      System.out.println(next.size());
    }
  }
}
