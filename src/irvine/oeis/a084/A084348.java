package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084348 Triangle in which row n gives periodic part of a certain map.
 * @author Sean A. Irvine
 */
public class A084348 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return CR.E.multiply(Functions.FACTORIAL.z(mM)).floor().subtract(CR.E.multiply(Functions.FACTORIAL.z(mM)).divide(mN).floor().multiply(mN));
  }
}
