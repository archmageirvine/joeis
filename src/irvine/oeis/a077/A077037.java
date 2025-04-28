package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A077037 Largest prime &lt; n^3.
 * @author Sean A. Irvine
 */
public class A077037 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Functions.PREV_PRIME.z(Z.valueOf(++mN).pow(3));
  }
}

