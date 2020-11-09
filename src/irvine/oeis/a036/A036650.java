package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036650 Number of 5-valent trees with n nodes.
 * @author Sean A. Irvine
 */
public class A036650 extends A036648 {

  private final Sequence mA = new A036649();

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
