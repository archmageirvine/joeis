package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A061398.
 * @author Sean A. Irvine
 */
public class A068363 extends Sequence1 {

  private final Sequence mA = new A000040();
  private final Sequence mB = new A000040().skip(2);
  private final Sequence mC = new A000040().skip(4);

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next().add(mB.next()).add(mC.next());
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

