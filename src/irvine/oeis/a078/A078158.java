package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A078158 a(n) = A078153(2^n).
 * @author Sean A. Irvine
 */
public class A078158 extends Sequence1 {

  private final DirectSequence mS = new A078153();
  private long mN = 0;

  @Override
  public Z next() {
    return mS.a(Z.ONE.shiftLeft(++mN));
  }
}
