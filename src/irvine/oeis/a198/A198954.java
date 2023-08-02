package irvine.oeis.a198;
// manually 2023-06-24

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A198954 Expansion of the rotational partition function for a heteronuclear diatomic molecule.
 * @author Georg Fischer
 */
public class A198954 extends BaseTriangle {

  /** Construct the sequence. */
  public A198954() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == 0) ? Z.valueOf(2L * n + 1) : Z.ZERO;
  }
}

