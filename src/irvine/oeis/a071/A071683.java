package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A071683 Nonprimes which are the average of two consecutive Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A071683 extends Sequence1 {

  private final Sequence mFibo = new A000045();
  private Z mA = mFibo.next();

  @Override
  public Z next() {
    while (true) {
      final Z b = mA;
      mA = mFibo.next();
      final Z t = mA.add(b);
      if (t.isEven()) {
        final Z u = t.divide2();
        if (!u.isProbablePrime()) {
          return u;
        }
      }
    }
  }
}
