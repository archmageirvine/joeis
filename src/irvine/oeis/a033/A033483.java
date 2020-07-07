package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006820;

/**
 * A033483 Number of disconnected <code>4-valent</code> (or quartic) graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A033483 extends A033301 {

  private final Sequence mA = new A006820();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

