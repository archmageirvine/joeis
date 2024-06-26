package irvine.oeis.a160;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A160243 a(n) = Lucas(n+1) + prime(n).
 * @author Georg Fischer
 */
public class A160243 extends A000040 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Functions.LUCAS.z(mN + 1).add(super.next());
  }
}
