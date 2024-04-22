package irvine.oeis.a166;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A166169 a(n) = Lucas(n^2) = A000204(n^2) for n &gt;= 1.
 * @author Georg Fischer
 */
public class A166169 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final long n = (long) ++mN * mN;
    return Functions.LUCAS.z(n);
  }
}
