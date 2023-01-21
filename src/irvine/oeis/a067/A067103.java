package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007908;
import irvine.oeis.a019.A019522;

/**
 * A067103 a(n) = floor(X/Y), where X = concatenation of cubes and Y = concatenation of natural numbers.
 * @author Georg Fischer
 */
public class A067103 extends Sequence1 {

  private final A019522 mSeq1 = new A019522();
  private final A007908 mSeq2 = new A007908();

  /** Construct the sequence. */
  public A067103() {
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
