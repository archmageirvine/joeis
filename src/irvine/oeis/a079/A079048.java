package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;
import irvine.util.string.Telephone;

/**
 * A079048 Numerical equivalents of the words zero, one, two, three, ... on touch-tone telephone.
 * @author Sean A. Irvine
 */
public class A079048 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return new Z(Telephone.dial(English.SINGLETON.toText(++mN)));
  }
}
