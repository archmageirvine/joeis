package irvine.oeis.a144;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A144646 a(n) = Bell(n) - 2^n + n.
 * @author Georg Fischer
 */
public class A144646 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.BELL.z(mN).subtract(Z.ONE.shiftLeft(mN)).add(mN);
  }
}
