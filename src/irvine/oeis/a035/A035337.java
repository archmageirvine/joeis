package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035337 Third column of Wythoff array.
 * @author Sean A. Irvine
 */
public class A035337 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.PHI.multiply(++mN).floor().multiply(3).add(2 * mN - 2);
  }
}

