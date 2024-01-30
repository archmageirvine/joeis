package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a046.A046099;

/**
 * A068109.
 * @author Sean A. Irvine
 */
public class A068140 extends Sequence1 {

  private final Sequence mSeq = new A046099();
  private Z mA = mSeq.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mSeq.next();
      if (t.add(1).equals(mA)) {
        return t;
      }
    }
  }
}
