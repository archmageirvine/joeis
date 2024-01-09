package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000196;

/**
 * A067815 a(n) = gcd(n, floor(sqrt(n))).
 * @author Georg Fischer
 */
public class A067815 extends Sequence1 {

  private int mN = 0;
  private final Sequence mSeq1 = new A000196().skip();

  @Override
  public Z next() {
    return Z.valueOf(++mN).gcd(mSeq1.next());
  }
}
