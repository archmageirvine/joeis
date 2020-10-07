package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035338 4th column of Wythoff array.
 * @author Sean A. Irvine
 */
public class A035338 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.PHI.multiply(++mN).floor().multiply(5).add(3 * mN - 3);
  }
}

