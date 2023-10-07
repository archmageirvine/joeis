package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066275 Number of endofunctions of [n] such that some element is fixed, but 1 is not fixed.
 * @author Sean A. Irvine
 */
public class A066275 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.pow(mN).subtract(n.pow(mN - 1)).subtract(Z.valueOf(mN - 1).pow(mN));
  }
}
