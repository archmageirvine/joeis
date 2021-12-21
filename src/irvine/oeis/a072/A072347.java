package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A072347 If n = pqr...st in binary, a(n) = value of continuant [p,q,r,...,s,t].
 * <code>a(2n) = a(floor(n/2)); a(4n+1) = a(2n+1); a(4n+3) = a(2n+1) + a(n)</code>.
 * @author Georg Fischer
 */
public class A072347 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n4 = size();
    if (n4 <= 2) {
      return Z.ONE;
    }
    final int n = n4 / 4;
    switch (n4 % 4) {
      case 1:
        return a(2 * n + 1);
      case 3:
        return a(2 * n + 1).add(a(n));
      case 0:
      case 2:
      default:
        return a(n);
    }
  }
}
