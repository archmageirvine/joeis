package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Galician;

/**
 * A053306 Number of letters in n-th number in Galego.
 * @author Sean A. Irvine
 */
public class A053306 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Galician.SINGLETON.toText(++mN).replace(" ", "").length());
  }
}
