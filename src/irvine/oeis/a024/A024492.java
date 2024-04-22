package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024492 Catalan numbers with odd index: a(n) = binomial(4*n+2, 2*n+1)/(2*n+2).
 * @author Sean A. Irvine
 */
public class A024492 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Functions.CATALAN.z((long) mN);
  }
}
