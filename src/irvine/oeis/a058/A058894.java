package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006881;
import irvine.oeis.a007.A007304;

/**
 * A058894 Squarefree semiprimes A006881(m) such that |A006881(m)-A007304(m)| = 1.
 * @author Sean A. Irvine
 */
public class A058894 extends A006881 {

  /** Construct the sequence. */
  public A058894() {
    super(1);
  }

  private final Sequence mA = new A007304();

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      final Z t = mA.next();
      if (s.subtract(t).abs().isOne()) {
        return s;
      }
    }
  }
}
