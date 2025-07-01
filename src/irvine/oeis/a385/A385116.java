package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033307;

/**
 * A385116 Take the natural numbers, erase all occurrences of the digit "0," and shift all remaining digits leftward without changing the position of commas.
 * @author Sean A. Irvine
 */
public class A385116 extends Sequence1 {

  private final Sequence mDigits = new FilterSequence(new A033307(), k -> !k.isZero());
  private long mN = 0;

  @Override
  public Z next() {
    Z v = Z.ZERO;
    final int len = Functions.DIGIT_LENGTH.i(++mN);
    for (int k = 0; k < len; ++k) {
      v = v.multiply(10).add(mDigits.next());
    }
    return v;
  }
}

