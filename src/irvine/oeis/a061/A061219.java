package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051885;

/**
 * A061219 a(n) is the largest number which can be formed with no zeros, using least number of digits and having digit sum = n.
 * @author Sean A. Irvine
 */
public class A061219 extends Sequence1 {

  private final A051885 mSeq = new A051885();

  /** Construct the sequence. */
  public A061219() {
    mSeq.next();
  }

  @Override
  public Z next() {
    return ZUtils.reverse(mSeq.next());
  }
}
