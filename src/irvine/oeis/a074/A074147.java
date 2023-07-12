package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A074147 (2n-1) odd numbers followed by 2n even numbers.
 * @author Georg Fischer
 */
public class A074147 extends Triangle {

  /** Construct the sequence. */
  public A074147() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n).square().add(1).divide2().add(1 + 2 * k);
  }
}
