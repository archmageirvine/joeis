package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000562 Number of discordant permutations.
 * @author Sean A. Irvine
 */
public class A000562 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    if (++mN == 4) {
      return Z.NINE;
    }
    final Z n2 = Z.valueOf(mN).square();
    return n2.square().multiply(27)
      .subtract(n2.multiply(mN).multiply(270))
      .add(n2.multiply(921))
      .subtract(Z.valueOf(1078).multiply(mN))
      .shiftRight(3);
  }
}

