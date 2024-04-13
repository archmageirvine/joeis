package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004165 Cubes written backwards.
 * @author Sean A. Irvine
 */
public class A004165 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.REVERSE.z(Z.valueOf(++mN).pow(3));
  }
}
