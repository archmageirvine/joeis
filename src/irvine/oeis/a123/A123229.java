package irvine.oeis.a123;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A123229 Triangle read by rows: T(n, m) = n - (n mod m).
 * @author Georg Fischer
 */
public class A123229 extends Triangle {

  /** Construct the sequence. */
  public A123229() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return Z.valueOf(n).subtract(Z.valueOf(n).mod(Z.valueOf(k)));
  }
}
