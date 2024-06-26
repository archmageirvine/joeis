package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A037458 a(1)=1; for n &gt; 1, a(n) = n - a(n-floor(sqrt(n))).
 * @author Sean A. Irvine
 */
public class A037458 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n == 1 ? Z.ONE : Z.valueOf(n).subtract(a(n - Functions.SQRT.i(n)));
  }
}
