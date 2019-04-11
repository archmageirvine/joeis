package irvine.oeis.a007;

import irvine.math.z.SquareFreeIterator;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007011 <code>a(n) =</code> smallest pseudoprime to base 2 with n prime factors.
 * @author Sean A. Irvine
 */
public class A007011 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    final SquareFreeIterator sfi = new SquareFreeIterator(++mN, 3);
    while (true) {
      final Z m = sfi.next();
      if (Z.ONE.equals(Z.TWO.modPow(m.subtract(1), m))) {
        return m;
      }
    }
  }
}

