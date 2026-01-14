package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392240 allocated for Alain Rocchelli.
 * @author Sean A. Irvine
 */
public class A392240 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 6;
    return Functions.GPF.z(mN);
  }
}

