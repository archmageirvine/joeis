package irvine.oeis.a098;
// manually concatf/concatb at 2022-12-30 21:09

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;
import irvine.oeis.a066.A066621;

/**
 * A098130 Concatenation of consecutive primes in the forward and reverse order.
 * @author Georg Fischer
 */
public class A098130 extends A066621 {

  /** Construct the sequence. */
  public A098130() {
    super(1, new A000040(), 10);
  }

  @Override
  public Z next() {
    ++mN;
    final String term = mSeq.a(mN - 1).toString(mBase);
    final StringBuilder result = new StringBuilder(mS.toString());
    mS.append(term);
    result.append(term);
    result.append(ZUtils.reverse(mSeq.a(mN - 1), mBase));
    for (int i = mN - 1; i >= 1; --i) {
      result.append(ZUtils.reverse(mSeq.a(i - 1), mBase));
    }
    return new Z(result.toString());
  }
}
