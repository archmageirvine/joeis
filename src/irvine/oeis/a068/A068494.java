package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068494 a(n) = n mod phi(n).
 * @author Sean A. Irvine
 */
public class A068494 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN % Functions.PHI.l(mN));
  }
}

