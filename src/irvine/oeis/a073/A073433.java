package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A073433 Value of [p(n)+c(n)]/2 when it is an integer; p(n) is n-th prime, c(n) is n-th composite.
 * @author Sean A. Irvine
 */
public class A073433 extends A000040 {

  private final Sequence mC = new A002808();

  @Override
  public Z next() {
    while (true) {
      final Z t = mC.next().add(super.next());
      if (t.isEven()) {
        return t.divide2();
      }
    }
  }
}
