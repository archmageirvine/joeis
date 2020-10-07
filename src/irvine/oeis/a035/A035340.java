package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035340 6th column of Wythoff array.
 * @author Sean A. Irvine
 */
public class A035340 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.PHI.multiply(++mN).floor().multiply(13).add(8 * mN - 8);
  }
}

