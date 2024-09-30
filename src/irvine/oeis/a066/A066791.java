package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066791 a(n) = phi(n^2 + n + 1).
 * @author Georg Fischer
 */
public class A066791 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.PHI.z((long) mN * mN + mN + 1);
  }
}
