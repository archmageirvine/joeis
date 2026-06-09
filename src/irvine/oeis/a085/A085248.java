package irvine.oeis.a085;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a014.A014612;

/**
 * A085248 Left truncatable 3-almost primes, in which repeatedly deleting the leftmost digit gives a 3-almost prime at every step until a single-digit 3-almost prime remains.
 * @author Sean A. Irvine
 */
public class A085248 extends A014612 {

  private final HashSet<Z> mA = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      mA.add(t);
      Z u = t;
      while (mA.contains(u)) {
        if (u.equals(Z.EIGHT)) {
          return t;
        }
        final String s = u.toString();
        if (s.length() <= 1 || s.charAt(1) == '0') {
          break;
        }
        u = new Z(s.substring(1));
      }
    }
  }
}
