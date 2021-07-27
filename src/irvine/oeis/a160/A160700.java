package irvine.oeis.a160;
// manually 2021-06-23

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A160700 a(n) = if n&lt;16 then n else a(floor(n/16)) XOR (n mod 16).
 * @author Georg Fischer
 */
public class A160700 extends MemorySequence {
    
  protected int mN = -1;
  
  @Override
  public Z computeNext() {
    ++mN;
    return mN < 16 ? Z.valueOf(mN) : a(mN / 16).xor(Z.valueOf(mN % 16));
  }
}
