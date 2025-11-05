package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a061.A061419;

/**
 * A081614 Subsequence of A005428 with state = 1.
 * @author Sean A. Irvine
 */
public class A081614 extends Sequence0 {

  private final Sequence mA = new A061419();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next();
      if (t.isEven()) {
        return t.divide2();
      }
    }
  }
}
