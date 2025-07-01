package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002808;

/**
 * A075078 Composite numbers which do not arise as a sum of two neighboring terms of A075077.
 * @author Sean A. Irvine
 */
public class A075078 extends A075077 {

  private final Sequence mComposites = new A002808();
  {
    super.next(); // Ensure mA is not null
    setOffset(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = mComposites.next();
      final Z c2 = c.multiply2();
      while (c2.compareTo(mA) > 0) {
        super.next();
      }
      if (!mSeenComposites.contains(c)) {
        return c;
      }
    }
  }
}

