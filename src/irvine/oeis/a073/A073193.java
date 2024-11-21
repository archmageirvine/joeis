package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073193 Number of separate orbits/cycles to which the Catalan bijection A057508 partitions each A000108(n) structures encoded in the range [A014137(n-1)..A014138(n-1)] of the sequence A014486/A063171.
 * @author Sean A. Irvine
 */
public class A073193 extends Sequence0 {

  private long mN = -1;

  private Z gat(final long n) {
    return n == -1 ? Z.ONE : Functions.CATALAN.z(n);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Functions.CATALAN.z(mN);
    for (long k = 0; k <= mN; k += 2) {
      sum = sum.add(gat(k / 2).multiply(gat(mN - 1 - k)));
    }
    return sum.divide2();
  }
}

