package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a054.A054973;

/**
 * A070224.
 * @author Sean A. Irvine
 */
public class A070242 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A054973());
  private long mN = 0;

  @Override
  public Z next() {
    return mA.a(Functions.SIGMA1.z(++mN));
  }
}

