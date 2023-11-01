package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002380;

/**
 * A065554 Numbers k such that floor((3/2)^(k+1))/floor((3/2)^k) = 3/2.
 * @author Sean A. Irvine
 */
public class A065554 extends Sequence1 {

  private final Sequence mSeq = new A002380();
  private Z mA = mSeq.next();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mSeq.next();
      if (t.multiply(3).equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
