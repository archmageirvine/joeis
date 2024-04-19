package irvine.oeis.a060;

import irvine.math.function.Functions;
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
    return ++mN < 0 ? Z.ONE : Functions.MULTIFACTORIAL.z(mN).add(Functions.MULTIFACTORIAL.z(mN + 1));
  }
}
