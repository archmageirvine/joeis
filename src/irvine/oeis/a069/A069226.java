package irvine.oeis.a069;
// manually nopan 

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000051;

/**
 * A069226 a(n) = gcd(n, 2^n + 1).
 * @author Georg Fischer
 */
public class A069226 extends Sequence0 {

  private int mN = -1;
  private final A000051 mSeq1 = new A000051();

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).gcd(mSeq1.next());
  }
}
