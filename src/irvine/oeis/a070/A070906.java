package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070906 Every third Bell number A000110.
 * @author Georg Fischer
 */
public class A070906 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.BELL.z(3 * mN);
  }
}
