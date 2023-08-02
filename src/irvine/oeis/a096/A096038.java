package irvine.oeis.a096;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A096038 Triangle T(n,m) = (3*n^2-3*m^2+5*m-4+n)/2 read by rows.
 * @author Georg Fischer
 */
public class A096038 extends Triangle {

  /** Construct the sequence. */
  public A096038() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return Z.valueOf(3L * n * n - 3L * k * k + 5L * k - 4 + n).divide2();
  }
}
