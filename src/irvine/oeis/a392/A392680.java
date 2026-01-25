package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.ThreeParameterFormSequence;

/**
 * A392680 allocated for Enrique Navarrete.
 * @author Sean A. Irvine
 */
public class A392680 extends ThreeParameterFormSequence {

  /** Construct the sequence. */
  public A392680() {
    super(1, 2, 2, 1, (a, k, b) -> Functions.PRIME.z(k).pow(2 * b + 1).add(Z.ONE.shiftLeft(a)));
  }

  @Override
  protected boolean accept(final long x, final long y, final long z, final Z n, final Z prev) {
    return !n.equals(prev) && n.isProbablePrime();
  }
}
