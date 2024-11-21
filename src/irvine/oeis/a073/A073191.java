package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073191 Number of separate orbits/cycles to which the Catalan bijections A072796/A072797 partition each A000108(n) structures encoded in the range [A014137(n-1)..A014138(n-1)] of the sequence A014486/A063171.
 * @author Sean A. Irvine
 */
public class A073191 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Functions.CATALAN.z(mN - 1).add(Functions.CATALAN.z(mN));
    for (long k = 0; k <= mN - 2; k += 2) {
      sum = sum.add(Functions.CATALAN.z(k / 2).multiply(Functions.CATALAN.z(mN - 2 - k)));
    }
    return sum.divide2();
  }
}
