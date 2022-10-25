package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A051680 Number of n X n invertible matrices A over GF(3) such that A-I is invertible.
 * @author Sean A. Irvine
 */
public class A051680 extends MemorySequence {

  // After Jean-Fran&ccedil;ois Alcover

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    final Z t = Z.THREE.pow(n - 1);
    return a(n - 1).multiply(t.multiply(3).subtract(1))
      .signedAdd((n & 1) == 0, Z.THREE.pow((n - 3) * (long) n / 2 + 1))
      .multiply(t);
  }
}
