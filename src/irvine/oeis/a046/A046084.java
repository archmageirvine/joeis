package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046084 The middle member 'b' of the Pythagorean triples (a,b,c) ordered by increasing c.
 * @author Sean A. Irvine
 */
public class A046084 implements Sequence {

  private long mN = 4;
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      if (!mA.isEmpty()) {
        return mA.pollFirst();
      }
      final long c2 = ++mN * mN;
      long a2;
      for (long a = 1; (a2 = a * a) <= c2 / 2; ++a) {
        final long b2 = c2 - a2;
        final long b = LongUtils.sqrt(b2);
        if (b * b == b2) {
          mA.add(Z.valueOf(b));
        }
      }
    }
  }
}
