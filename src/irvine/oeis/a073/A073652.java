package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a025.A025475;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073652 extends Sequence1 {

  private final Sequence mSeq = new A025475().skip();
  private Z mA = mSeq.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mSeq.next();
      final Z u = mA.subtract(t);
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}
