package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A068739 Width of the bit-masks A068221 &amp; A068222 (number of digits in A068223 &amp; A068224).
 * @author Sean A. Irvine
 */
public class A068739 extends Sequence1 {

  private final Sequence mSeq = new A068059();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2().add(mSeq.next()).subtract(1);
    return mA;
  }
}

