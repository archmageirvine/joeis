package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061364 Pseudo-random numbers: a (very weak) pseudo-random number generator from the second edition of the C book.
 * @author Sean A. Irvine
 */
public class A061364 extends Sequence1 {

  private int mN = 1;

  @Override
  public Z next() {
    mN *= 1103515245;
    mN += 12345;
    return Z.valueOf((mN >> 16) & 0x7FFF);
  }
}

