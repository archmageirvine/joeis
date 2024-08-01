package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A071637 Largest exponent k &gt;=0 such that (n+1)^k divides n!.
 * @author Sean A. Irvine
 */
public class A071637 extends Sequence1 {

  private final Sequence mF = new A000142().skip();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z f = mF.next();
    long m = 0;
    while (f.mod(mN) == 0) {
      f = f.divide(mN);
      ++m;
    }
    return Z.valueOf(m);
  }
}
