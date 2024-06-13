package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070556 a(n) = cototient(totient(n)).
 * @author Sean A. Irvine
 */
public class A070556 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.COTOTIENT.z(Functions.PHI.l(++mN));
  }
}

