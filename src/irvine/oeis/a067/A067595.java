package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a003.A003263;

/**
 * A067595 Number of partitions of n into distinct Lucas parts (A000032).
 * @author Sean A. Irvine
 */
public class A067595 extends Sequence0 {

  private final Sequence mSeq = new PrependSequence(new A003263(), 1);
  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = mSeq.next();
    return t.add(mB);
  }
}
