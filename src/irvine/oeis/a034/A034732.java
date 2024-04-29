package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034732 Dirichlet convolution of b_n=1 with Bell numbers.
 * @author Sean A. Irvine
 */
public class A034732 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Functions.BELL.z(d - 1));
  }
}
