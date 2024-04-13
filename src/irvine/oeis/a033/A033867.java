package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A033867 Palindrome reached from A033866(n) by Reverse-then-add.
 * @author Sean A. Irvine
 */
public class A033867 extends AbstractSequence {

  private final A033866 mSeq1 = new A033866();

  /** Construct the sequence. */
  public A033867() {
    super(1);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = mSeq1.next();
    for (int k = 0; k < mN; ++k) {
      s = s.add(Functions.REVERSE.z(s));
    }
    return s;
  }
}
