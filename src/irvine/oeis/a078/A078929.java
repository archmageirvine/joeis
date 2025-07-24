package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000002;

/**
 * A078929 Least k &gt; 0 such that A000002(n+k) = A000002(n).
 * @author Sean A. Irvine
 */
public class A078929 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A000002());
  private int mN = 0;

  @Override
  public Z next() {
    final Z t = mA.a(++mN);
    int m = mN;
    while (!mA.a(++m).equals(t)) {
      // do nothing
    }
    return Z.valueOf(m - mN);
  }
}
