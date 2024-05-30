package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046083 The smallest member 'a' of the Pythagorean triples (a,b,c) ordered by increasing c.
 * @author Sean A. Irvine
 */
public class A046083 extends Sequence1 {

  private long mN = 4;
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      if (!mA.isEmpty()) {
        return mA.pollLast();
      }
      final long c2 = ++mN * mN;
      long a2;
      for (long a = 1; (a2 = a * a) <= c2 / 2; ++a) {
        final long b2 = c2 - a2;
        final long b = Functions.SQRT.l(b2);
        if (b * b == b2) {
          mA.add(Z.valueOf(a));
        }
      }
    }
  }
}
