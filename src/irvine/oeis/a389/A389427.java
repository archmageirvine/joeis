package irvine.oeis.a389;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389427 a(n) = Sum_{i=1..n} (Product_{j=1..n} M(j, ((i+j-2) mod n)+1) - Product_{j=1..n} M(j, ((i-j-1) mod n)+1)) where M is the n X n matrix M(n) formed by writing the numbers 1, ..., n^2 successively forward and backward along the rows in zig-zag pattern.
 * @author Sean A. Irvine
 */
public class A389427 extends Sequence0 {

  private int mN = -1;

  protected long m(final int i, final int j, final int n) {
    return 1 - j + (long) i * n + (2L * j - n - 1) * (i & 1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, i ->
      Integers.SINGLETON.product(1, mN, j -> Z.valueOf(m(j, (mN + i + j - 2) % mN + 1, mN)))
        .subtract(Integers.SINGLETON.product(1, mN, j -> Z.valueOf(m(j, (mN + i - j - 1) % mN + 1, mN)))));
  }
}
