package irvine.oeis.a226;
// manually mult at 2022-08-01 10:35

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A226162 a(n) = Kronecker Symbol (-5/n), n &gt;= 0.
 * @author Georg Fischer
 */
public class A226162 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.KRONECKER.z(-5, ++mN);
  }
}
