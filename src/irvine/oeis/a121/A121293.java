package irvine.oeis.a121;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A121293 a(n) = Bell(3*n+2).
 * @author Georg Fischer
 */
public class A121293 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.BELL.z(3 * mN + 2);
  }
}
