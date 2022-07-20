package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A127427 a(n) = v_3( (6n)! ) - v_3( (3n)! ), where v_3(N) is the 3-adic valuation A007949(N).
 * @author Sean A. Irvine
 */
public class A127427 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n == 0 ? Z.ZERO : get((n + 1) / 3).add(n);
  }
}
