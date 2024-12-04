package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a066.A066272;

/**
 * A073545.
 * @author Sean A. Irvine
 */
public class A073547 extends Sequence1 {

  private final Sequence mSeq = new A066272();
  private long mN = 0;
  private Z mA = mSeq.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mSeq.next();
      if (t.equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
