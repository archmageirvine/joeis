package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036420 Number of ternary rooted trees with n nodes and height exactly 5.
 * @author Sean A. Irvine
 */
public class A036420 extends A036373 {

  private final Sequence mA = new A036372();

  @Override
  public Z next() {
    final Z t = super.next();
    if (t == null) {
      return null; // end reached
    }
    final Z a = mA.next();
    return t.subtract(a == null ? Z.ZERO : a);
  }
}
