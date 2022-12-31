package irvine.oeis.a066;
// manually concatf/concatb at 2022-12-30 21:09

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066622 Concatenation of prime numbers in increasing order up to the n-th and then in decreasing order.
 * @author Georg Fischer
 */
public class A066622 extends A066621 {

  /** Construct the sequence. */
  public A066622() {
    super(1, new A000040(), 10);
  }

  @Override
  public Z next() {
    ++mN;
    final String term = mSeq.a(mN - 1).toString(mBase);
    final StringBuilder result = new StringBuilder(mS.toString());
    mS.append(term);
    result.append(term);
    for (int i = mN - 1; i >= 1; --i) {
      result.append(mSeq.a(i - 1));
    }
    return new Z(result.toString());
  }
}
