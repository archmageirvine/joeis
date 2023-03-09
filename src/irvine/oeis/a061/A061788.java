package irvine.oeis.a061;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061788 a(n) = Sum_{k=1..n} (2k)^(2k).
 * @author Sean A. Irvine
 */
public class A061788 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> Z.valueOf(2L * k).pow(2L * k));
  }
}

