package irvine.oeis.a230;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A230601 a(n) = Lucas(2^n + 2).
 * @author Georg Fischer
 */
public class A230601 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.LUCAS.z((1L << mN) + 2);
  }
}
