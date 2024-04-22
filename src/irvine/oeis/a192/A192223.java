package irvine.oeis.a192;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A192223 a(n) = Lucas(2^n + 1).
 * @author Georg Fischer
 */
public class A192223 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.LUCAS.z((1L << mN) + 1);
  }
}
