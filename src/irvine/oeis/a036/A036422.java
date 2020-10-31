package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036422 Number of ternary rooted trees with n nodes and height exactly 7.
 * @author Sean A. Irvine
 */
public class A036422 extends A036375 {

  private final Sequence mA = new A036374();

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
