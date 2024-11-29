package irvine.oeis.a073;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A073431 Number of separate orbits/cycles to which the Catalan bijections A069767/A069768 partition each A000108(n) structures encoded in the range [A014137(n-1)..A014138(n-1)] of the sequence A014486/A063171.
 * @author Sean A. Irvine
 */
public class A073431 extends A073346 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> mB.get(mN, k).shiftLeft(mN - k)).shiftRight(mN);
  }
}
