package irvine.oeis.a043;

import irvine.math.LongUtils;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A043548 Least separator of first n Egyptian fractions; i.e., least k for which the integers floor(k/m) for m=1,2,...,n are distinct.
 * @author Sean A. Irvine
 */
public class A043548 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    final long s = LongUtils.sqrt(mN - 1);
    final Z t = CR.valueOf(mN).sqrt().add(CR.HALF).floor();
    return Z.valueOf(mN).square()
      .add(t.multiply(s))
      .subtract(s * mN)
      .subtract(t.multiply(mN));
  }
}
