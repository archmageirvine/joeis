package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a056.A056924;

/**
 * A061408 For each y &gt;= 1 there are only finitely many values of x &gt;= 1 such that x-y and x+y are both positive squares; list all such pairs (x,y) ordered by values of y; sequence gives y values.
 * @author Sean A. Irvine
 */
public class A061408 extends Sequence0 {

  private final A056924 mSeq = new A056924();
  private long mCount = mSeq.next().longValue();
  private Z mN = Z.TWO;

  @Override
  public Z next() {
    if (--mCount < 0) {
      mN = mN.add(2);
      mCount = mSeq.next().longValue() - 1;
    }
    return mN;
  }
}

