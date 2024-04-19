package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007863;

/**
 * A011272 Hybrid binary rooted trees with n nodes whose root is labeled by "a".
 * @author Sean A. Irvine
 */
public class A011272 extends A007863 {

  private final Sequence mA = new A011270();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

