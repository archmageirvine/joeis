package irvine.oeis.a145;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000005;

/**
 * A145154 Coefficients in expansion of Eisenstein series E_1.
 * a(0) = 1; for n &gt;= 1, a(n) = 4*A000005(n).
 * @author Georg Fischer
 */
public class A145154 extends Sequence1 {

  private int mN = -1;
  private final A000005 mSeq = new A000005();

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : mSeq.next().multiply(4);
  }
}
