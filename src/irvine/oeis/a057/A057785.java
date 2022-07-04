package irvine.oeis.a057;

import irvine.math.lattice.Animal;
import irvine.math.z.Z;

/**
 * A057784 Number of polypons with n cells.
 * @author Sean A. Irvine
 */
public class A057785 extends A057784 {

  private boolean isBlunt(final Animal a, final long x, final long y, final long z) {
    switch ((int) z) {
      case 0:
        if (a.contains(L.toPoint(x, y, 3))) {
          return true;
        }
        return a.contains(L.toPoint(x, y, 1)) && a.contains(L.toPoint(x, y, 2));
      case 1:
        if (a.contains(L.toPoint(x, y, 4))) {
          return true;
        }
        return a.contains(L.toPoint(x, y, 0)) && a.contains(L.toPoint(x, y, 2));
      case 2:
        if (a.contains(L.toPoint(x, y, 5))) {
          return true;
        }
        return a.contains(L.toPoint(x, y, 0)) && a.contains(L.toPoint(x, y, 1));
      case 3:
        if (a.contains(L.toPoint(x, y, 0))) {
          return true;
        }
        return a.contains(L.toPoint(x, y - 1, 5)) && a.contains(L.toPoint(x + 1, y - 1, 4));
      case 4:
        if (a.contains(L.toPoint(x, y, 1))) {
          return true;
        }
        return a.contains(L.toPoint(x - 1, y, 5)) && a.contains(L.toPoint(x - 1, y + 1, 3));
      case 5:
        if (a.contains(L.toPoint(x, y, 2))) {
          return true;
        }
        return a.contains(L.toPoint(x + 1, y, 4)) && a.contains(L.toPoint(x, y + 1, 3));
      default:
        throw new RuntimeException();
    }
  }

  private boolean isBlunt(final Animal a) {
    for (final long pt : a.points()) {
      final long x = L.ordinate(pt, 0);
      final long y = L.ordinate(pt, 1);
      final long z = L.ordinate(pt, 2);
      if (!isBlunt(a, x, y, z)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    super.next();
    long cnt = 0;
    for (final Animal a : mCanons) {
      if (isBlunt(a)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
