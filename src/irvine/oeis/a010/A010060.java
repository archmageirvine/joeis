package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A010060 Thue-Morse sequence: let <code>A_k</code> denote the first <code>2^k</code> terms; then <code>A_0 = 0</code> and for k <code>&gt;= 0, A_{k+1} = A_k B_k</code>, where <code>B_k</code> is obtained from <code>A_k</code> by interchanging <code>0</code>'s and <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A010060 extends MemorySequence {

  @Override
  protected Z computeNext() {
    return size() == 0 ? Z.ZERO : get(size() / 2).add(size()).mod(Z.TWO);
  }
}

