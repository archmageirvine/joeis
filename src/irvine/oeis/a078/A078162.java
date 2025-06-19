package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a051.A051201;

/**
 * A078162 a(n) = A051201(n!).
 * @author Sean A. Irvine
 */
public class A078162 extends Sequence0 {

  private final DirectSequence mS = new A051201();
  private long mN = -1;

  @Override
  public Z next() {
    return mS.a(Functions.FACTORIAL.z(++mN));
  }
}
