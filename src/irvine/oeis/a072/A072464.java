package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072464 Code word lengths for non-redundant MML code for positive integers.
 * @author Sean A. Irvine
 */
public class A072464 extends Sequence1 {

  private long mN = 0;

  private long length(final long n) {
    if (n <= 1) {
      return 1;
    }
    final int len = Functions.DIGIT_LENGTH.i(2, n);
    return length(len - 1) + len;
  }

  @Override
  public Z next() {
    return Z.valueOf(length(++mN));
  }
}

