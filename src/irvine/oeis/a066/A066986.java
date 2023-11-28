package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001088;

/**
 * A066986 Integers of the form (Product_{i=1..k} sigma(i))/(Product_{i=1..k} phi(i)) = A066780(k)/A001088(k).
 * @author Sean A. Irvine
 */
public class A066986 extends Sequence1 {

  private final Sequence mA = new A066780();
  private final Sequence mB = new A001088().skip();

  @Override
  public Z next() {
    while (true) {
      final Z[] qr = mA.next().divideAndRemainder(mB.next());
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
