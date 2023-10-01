package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001212;

/**
 * A066063 Size of the smallest subset S of T={0,1,2,...,n} such that each element of T is the sum of two elements of S.
 * @author Sean A. Irvine
 */
public class A066063 extends Sequence0 {

  private final Sequence mSeq = new A001212();
  private long mA = mSeq.next().longValueExact();
  private long mK = 2;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN > mA) {
      ++mK;
      mA = mSeq.next().longValueExact();
    }
    return Z.valueOf(mK);
  }
}
