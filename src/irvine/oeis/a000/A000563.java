package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000563 Number of discordant permutations.
 * @author Sean A. Irvine
 */
public class A000563 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    final Z n4 = n2.square();
    return n4.multiply(mN).multiply(81)
      .subtract(n4.multiply(1350))
      .add(n2.multiply(mN).multiply(8595))
      .subtract(n2.multiply(24870))
      .add(Z.valueOf(27704).multiply(mN))
      .divide(40);
  }
}

