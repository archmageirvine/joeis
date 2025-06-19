package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000203;
import irvine.oeis.a051.A051201;
/**
 * A078153 a(n) = A051201(n) - A000203(n).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A078153 extends Sequence1 implements DirectSequence {

  private final Sequence mA000203 = new A000203();
  private final DirectSequence mA051201 = new A051201();

  @Override
  public Z next() {
    return mA051201.next().subtract(mA000203.next());
  }

  @Override
  public Z a(final Z n) {
    return mA051201.a(n).subtract(Functions.SIGMA1.z(n));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
