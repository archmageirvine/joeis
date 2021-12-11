package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a008.A008683;

/**
 * A053139 a(n) = phi(n) - mu(n).
 * @author Sean A. Irvine
 */
public class A053139 extends A000010 {

  private final Sequence mMu = new A008683();

  @Override
  public Z next() {
    return super.next().subtract(mMu.next());
  }
}
