package irvine.oeis.a301;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;
import irvine.oeis.memory.MemorySequence;

/**
 * A301315.
 * @author Sean A. Irvine
 */
public class A301315 extends MemorySequence {

  {
    add(null); // 0 unused
    setOffset(1);
  }
  private final MultiplicativeSequence mB = new MultiplicativeSequence(1, (p, e) -> Puma.primeZ(p).pow(a(e)));

  @Override
  protected Z computeNext() {
    return mB.next();
  }
}
