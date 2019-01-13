package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007863;

/**
 * A011272.
 * @author Sean A. Irvine
 */
public class A011272 extends A007863 {

  private Sequence mA = new A011270();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

