package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000561 Number of discordant permutations.
 * @author Sean A. Irvine
 */
public class A000561 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    final Z n2 = Z.valueOf(mN).square();
    return n2.multiply(mN * 9).subtract(n2.multiply(45)).add(58 * mN).divide2();
  }
}

