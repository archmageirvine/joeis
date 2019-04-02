package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000487 Number of permutations of length n with exactly two valleys.
 * @author Sean A. Irvine
 */
public class A000487 implements Sequence {

  private int mN = 4;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return Z.SIX.pow(mN)
      .add(Z.valueOf(2 - 2 * mN).shiftLeft(2 * mN))
      .add(n.square().multiply2().subtract(n.shiftLeft(2)).subtract(1).shiftLeft(mN))
      .shiftRight(5);
  }
}
