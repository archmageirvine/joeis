package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069010 Number of runs of 1's in the binary representation of n.
 * @author Georg Fischer
 */
public class A069010 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.RUNS_OF_1.z(++mN);
  }
}
