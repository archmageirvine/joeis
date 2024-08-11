package irvine.oeis.a292;
// manually anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001203;
import irvine.oeis.a003.A003417;

/**
 * A292106 Term-by-term products of continued fraction expansion of e and Pi.
 * @author Georg Fischer
 */
public class A292106 extends AbstractSequence {

  private final A003417 mSeq1 = new A003417();
  private final A001203 mSeq2 = new A001203();

  /** Construct the sequence. */
  public A292106() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
