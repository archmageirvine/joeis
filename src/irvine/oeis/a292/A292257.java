package irvine.oeis.a292;

import irvine.math.z.Z;
import irvine.oeis.a000.A000120;
import irvine.oeis.a192.A192895;

/**
 * A292257 a(n) is the total number of 1&apos;s in binary expansion of all proper divisors of n.
 * @author Georg Fischer
 */
public class A292257 extends A192895 {

  private A000120 mSeq = new A000120();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().add(super.next());
  }
}
