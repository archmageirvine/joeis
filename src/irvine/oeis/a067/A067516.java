package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A067516 Fibonacci numbers starting with a different Fibonacci number of at least two digits.
 * @author Sean A. Irvine
 */
public class A067516 extends Sequence1 {

  private final Sequence mFibo = new A000045().skip(7);

  @Override
  public Z next() {
    while (true) {
      final Z f = mFibo.next();
      final String fs = f.toString();
      final Sequence s = new A000045().skip(7);
      Z t;
      while (!(t = s.next()).equals(f)) {
        if (fs.startsWith(t.toString())) {
          return f;
        }
      }
    }
  }
}

