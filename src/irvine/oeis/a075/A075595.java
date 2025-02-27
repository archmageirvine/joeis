package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075595 Smallest prime that is obtained by placing digits on both sides of the n-th prime. Or smallest prime that encompasses the n-th prime.
 * @author Sean A. Irvine
 */
public class A075595 extends A000040 {

  static Z findPrime(final Z p) {
    Z m = Z.TEN;
    while (p.compareTo(m) > 0) {
      m = m.multiply(10);
    }
    for (long k = 1; k < 10; ++k) {
      final Z a = m.multiply(k).add(p).multiply(10);
      final Z a1 = a.add(1);
      if (a1.isProbablePrime()) {
        return a1;
      }
      final Z a3 = a.add(3);
      if (a3.isProbablePrime()) {
        return a3;
      }
      final Z a7 = a.add(7);
      if (a7.isProbablePrime()) {
        return a7;
      }
      final Z a9 = a.add(9);
      if (a9.isProbablePrime()) {
        return a9;
      }
    }
    // If we reach here, then adding a single digit to each side is not sufficient
    // Try adding 2 digits on length and 1 on right or vice versa
    final Z v = m.multiply(1000);
    Z min = v;
    for (long j = 1; j < 100; ++j) {
      if (j < 10) {
        // 1 digit left, 2 digits right
        final Z a = m.multiply(j).add(p).multiply(100);
        for (long k = 0; k < 100; k += 10) {
          final Z a1 = a.add(k + 1);
          if (a1.isProbablePrime()) {
            min = min.min(a1);
          } else {
            final Z a3 = a.add(k + 3);
            if (a3.isProbablePrime()) {
              min = min.min(a3);
            } else {
              final Z a7 = a.add(k + 7);
              if (a7.isProbablePrime()) {
                min = min.min(a7);
              } else {
                final Z a9 = a.add(k + 9);
                if (a9.isProbablePrime()) {
                  min = min.min(a9);
                }
              }
            }
          }
        }
      } else {
        // 2 digits left, 1 digit right
        final Z a = m.multiply(j).add(p).multiply(10);
        final Z a1 = a.add(1);
        if (a1.isProbablePrime()) {
          min = min.min(a1);
        } else {
          final Z a3 = a.add(3);
          if (a3.isProbablePrime()) {
            min = min.min(a3);
          } else {
            final Z a7 = a.add(7);
            if (a7.isProbablePrime()) {
              min = min.min(a7);
            } else {
              final Z a9 = a.add(9);
              if (a9.isProbablePrime()) {
                min = min.min(a9);
              }
            }
          }
        }
      }
    }
    if (min.equals(v)) {
      throw new RuntimeException();
    }
    return min;
  }

  @Override
  public Z next() {
    return findPrime(super.next());
  }
}

