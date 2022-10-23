package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035339 5th column of Wythoff array.
 * @author Sean A. Irvine
 */
public class A035339 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.PHI.multiply(++mN).floor().multiply(8).add(5 * mN - 5);
  }
}

