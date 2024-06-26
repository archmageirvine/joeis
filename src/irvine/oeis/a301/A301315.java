package irvine.oeis.a301;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;
import irvine.oeis.memory.MemorySequence;

/**
 * A301315 Multiplicative with a(p^e) = prime(p) ^ a(e) (where prime(k) denotes the k-th prime number).
 * @author Sean A. Irvine
 */
public class A301315 extends MemorySequence {

  {
    add(null); // 0 unused
    setOffset(1);
  }
  private final MultiplicativeSequence mB = new MultiplicativeSequence(1, (p, e) -> Functions.PRIME.z(p).pow(a(e)));

  @Override
  protected Z computeNext() {
    return mB.next();
  }
}
