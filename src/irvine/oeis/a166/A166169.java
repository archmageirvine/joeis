package irvine.oeis.a166;

import irvine.math.z.Fibonacci;
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
    return Fibonacci.lucas((long) ++mN * mN);
  }
}
