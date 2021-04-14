package irvine.math.group;

import java.util.Arrays;
import java.util.HashSet;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.api.Group;
import irvine.math.z.Z;

/**
 * Utility functions relating to groups.
 *
 * @author Sean A. Irvine
 */
public final class GroupUtils {

  private GroupUtils() { }

  /**
   * An exhaustive test for commutativity in the group.  In general this should
   * not be called directly.  Instead use <code>group.isAbelian()</code> which
   * in most cases is much more efficient.
   * @param <T> type of group
   * @param group group to test
   * @return true if the group is Abelian
   */
  static <T> boolean isAbelian(final Group<T> group) {
    group.abortOnInfinite();
    final HashSet<T> done = new HashSet<>();
    for (final T a : group) {
      done.add(a);
      for (final T b : group) {
        if (!done.contains(b) && !group.add(a, b).equals(group.add(b, a))) {
          return false;
        }
      }
    }
    return true;
  }

  private static Z gnu(final Z p, final int e) {
    switch (e) {
    case 1: // p
      return Z.ONE;
    case 2: // p^2
      return Z.TWO;
    case 3: // p^3
      return Z.FIVE;
    case 4:
      return Z.TWO.equals(p) ? Z.valueOf(14) : Z.valueOf(15);
    case 5:
      if (Z.THREE.compareTo(p) >= 0) {
        return p.isEven() ? Z.valueOf(51) : Z.valueOf(67);
      }
      return p.add(Z.THREE.gcd(p.subtract(1))).multiply2().add(61).add(Z.FOUR.gcd(p.subtract(1)));
    default:
      throw new UnsupportedOperationException();
    }
  }

  private static Z gnu(final Z p, final int pe, final Z q, final int qe) {
    if (qe < pe) { // force p^aq^b, a<b
      return gnu(q, qe, p, pe);
    }
    if (pe == 1) {
      switch (qe) {
      case 1: // pq
        return Z.ONE.equals(p.gcd(q.subtract(1))) ? Z.ONE : Z.TWO;
      case 2: // pq^2
        final boolean a = q.subtract(1).mod(p).isZero();
        final boolean b = q.add(1).mod(p).isZero();
        final boolean c = p.subtract(1).mod(q).isZero();
        if (Z.TWO.equals(p)) {
          return Z.FIVE;
        } else if (!a && !b && !c) {
          return Z.TWO;
        } else if (b && q.isOdd()) {
          return Z.THREE;
        } else if (p.subtract(1).mod(q.square()).isZero()) {
          return Z.FIVE;
        } else if (c && Z.THREE.compareTo(p) < 0) {
          return Z.FOUR;
        } else if (Z.THREE.equals(p) && Z.TWO.equals(q)) {
          return Z.FIVE;
        } else {
          return p.add(9).divide(2);
        }
      case 3:
        if (Z.TWO.equals(q)) { // 2^3p

          // If p == 3, then 15
          // If p == 7, then 13
          // If p % 4 == 3 appears to be 12
          // If p % 8 == 1 appears to be 15
          // Otherwise 14

          if (Z.THREE.equals(p)) {
            return Z.valueOf(15);
          } else if (Z.SEVEN.equals(p)) {
            return Z.valueOf(13);
          } else if (p.mod(4) == 3) {
            return Z.valueOf(12);
          } else if (p.mod(8) == 1) {
            return Z.valueOf(15);
          } else {
            return Z.valueOf(14);
          }
        }
        throw new UnsupportedOperationException();
      case 4:
        if (Z.TWO.equals(q)) { // 2^4p
          final long s = p.mod(4);
          final long t = p.mod(8);
          final long u = p.mod(16);
          if (s == 1 && t == 1 && u == 1) {
            return Z.valueOf(54);
          } else if (s == 3) {
            return Z.valueOf(42);
          } else if (t == 5) {
            return Z.valueOf(51);
          }
          return Z.valueOf(53);
        }
        throw new UnsupportedOperationException();
      default:
        throw new UnsupportedOperationException();
      }
    }
    throw new UnsupportedOperationException();
  }

  private static Z gnu3(final FactorSequence fs) {
    final Z[] n = fs.toZArray();
    Arrays.sort(n);
    final Z p = n[0];
    final Z q = n[1];
    final Z r = n[2];
    if (fs.getExponent(p) == 1 && fs.getExponent(q) == 1 && fs.getExponent(r) == 1) {
      final boolean a = Z.ONE.equals(q.mod(p));
      final boolean b = Z.ONE.equals(r.mod(p));
      final boolean c = Z.ONE.equals(r.mod(q));
      if (a) {
        if (b) {
          return c ? p.add(4) : p.add(2);
        } else {
          return c ? Z.THREE : Z.TWO;
        }
      } else {
        if (b) {
          return c ? Z.FOUR : Z.TWO;
        } else {
          return c ? Z.TWO : Z.ONE;
        }
      }
    }
    throw new UnsupportedOperationException();
  }

  private static Z gnuSpecial(final long n) {
    // Some cases where I don't know a general expression
    if (n > Integer.MAX_VALUE) {
      return null;
    }
    switch ((int) n) {
    case 0:
      return Z.ZERO;
    case 1:
      return Z.ONE;
    case 90:
      return Z.TEN;
    case 60:
      return Z.valueOf(13);
    case 36:
      return Z.valueOf(14);
    case 54:
    case 84:
      return Z.valueOf(15);
    case 112:
      return Z.valueOf(43);
    case 72:
      return Z.valueOf(50);
    case 48:
    case 80:
      return Z.valueOf(52);
    case 96:
      return Z.valueOf(231);
    case 64:
      return Z.valueOf(267);
    default:
      return null;
    }
  }

  /**
   * Return the number of group of the specified order.
   *
   * @param n order
   * @return number of groups
   */
  public static Z gnu(final long n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    final Z y = gnuSpecial(n);
    if (y != null) {
      return y;
    }
    final FactorSequence fs = Cheetah.factor(n);
    if (!fs.isComplete()) {
      throw new UnsupportedOperationException();
    }
    final Z p = fs.toZArray()[0];
    switch (fs.omega()) {
    case 1:
      return gnu(p, fs.getExponent(p));
    case 2:
      final Z q = fs.toZArray()[1];
      return gnu(p, fs.getExponent(p), q, fs.getExponent(q));
    case 3:
      return gnu3(fs);
    default:
      return null;
    }
  }

  /**
   * Noddy.
   * @param args get gnu of this number
   */
  public static void main(final String[] args) {
    System.out.println(gnu(Long.parseLong(args[0])));
  }
}
