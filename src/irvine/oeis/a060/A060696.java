package irvine.oeis.a060;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060696 Number of permutations in S_n avoiding the strings 123, 321 and 231.
 * @author Sean A. Irvine
 */
public class A060696 extends Sequence0 {

  private int mN = -3;

  @Override
  public Z next() {
    return ++mN < 0 ? Z.ONE : MemoryFactorial.SINGLETON.doubleFactorial(mN).add(MemoryFactorial.SINGLETON.doubleFactorial(mN + 1));
  }
}
