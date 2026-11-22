package irvine.oeis.a093;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001644;

/**
 * A093305 Number of binary necklaces of length n with no subsequence 000.
 * @author Gregory Morse
 */
public class A093305 extends Sequence1 {
  private final DirectSequence mCircularWords;
  private int mN = 0;

  protected A093305(final Sequence circularWords) {
    mCircularWords = DirectSequence.create(circularWords);
  }

  /** Construct the sequence. */
  public A093305() {
    this(new A001644());
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      sum = sum.add(mCircularWords.a(d).multiply(Functions.PHI.z(mN / d.intValueExact())));
    }
    return sum.divide(mN);
  }
}
