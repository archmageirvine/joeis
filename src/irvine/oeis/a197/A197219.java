package irvine.oeis.a197;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A197219 a(0) = 2, a(n) = Lucas(phi(n)) for n &gt; 0.
 * @author Georg Fischer
 */
public class A197219 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.TWO;
    }
    return Functions.LUCAS.z(Functions.PHI.i(mN));
  }
}
