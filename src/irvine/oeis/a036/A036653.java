package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036653 Number of 6-valent trees with n nodes.
 * @author Sean A. Irvine
 */
public class A036653 extends A036651 {

  private final Sequence mA = new A036652();

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
