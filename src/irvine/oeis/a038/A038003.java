package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038003 Odd Catalan numbers; more precisely, A000108(2^n-1).
 * @author Sean A. Irvine
 */
public class A038003 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final long n = (1L << ++mN) - 1;
    return Functions.CATALAN.z(n);
  }
}
