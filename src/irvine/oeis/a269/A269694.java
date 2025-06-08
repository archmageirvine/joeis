package irvine.oeis.a269;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a015.A015013;

/**
 * A269694 Product of first n nonzero Jacobsthal numbers (A001045).
 * @author Georg Fischer
 */
public class A269694 extends Sequence1 {

  private final Sequence mA015013 = new A015013().skip();

  @Override
  public Z next() {
    return mA015013.next().abs();
  }
}
