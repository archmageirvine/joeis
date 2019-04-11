package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;
import irvine.util.string.Telephone;

/**
 * A079048 Numerical equivalents of the words zero, one, two, three, <code>...</code> on touch-tone telephone.
 * @author Sean A. Irvine
 */
public class A079048 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return new Z(Telephone.dial(English.toEnglish(++mN)));
  }
}
