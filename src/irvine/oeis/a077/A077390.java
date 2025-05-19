package irvine.oeis.a077;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A077390 Primes which leave primes at every step if most significant digit and least significant digit are deleted until a one digit or two digit prime is obtained.
 * @author Sean A. Irvine
 */
public class A077390 extends Sequence1 {

  private static final String[] SUFFIX = {"1", "3", "7", "9"};
  private static final Z Z100 = Z.valueOf(100);
  private final TreeSet<Z> mA = new TreeSet<>();
  {
    final Sequence primes = new A000040();
    Z p;
    while ((p = primes.next()).compareTo(Z100) < 0) {
      mA.add(p);
    }
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    final String s = res.toString();
    for (final String suffix : SUFFIX) {
      for (int pre = 1; pre < 10; ++pre) {
        final Z t = new Z(pre + s + suffix);
        if (t.isProbablePrime()) {
          mA.add(t);
        }
      }
    }
    return res;
  }
}
