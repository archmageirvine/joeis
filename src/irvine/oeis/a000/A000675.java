package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000675 Number of centered <code>3-valent (or</code> boron, or binary) trees with n nodes.
 * @author Sean A. Irvine
 */
public class A000675 extends A000672 {

  private final Sequence mA673 = new A000673();

  @Override
  public Z next() {
    return super.next().subtract(mA673.next());
  }
}
