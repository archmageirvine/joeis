package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392038 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A392218 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.POD.z(Functions.PHI.l(++mN));
  }
}

