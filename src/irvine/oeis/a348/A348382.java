package irvine.oeis.a348;
// manually anopan 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a059.A059841;
import irvine.oeis.a261.A261983;

/**
 * A348382 Number of compositions of n that are not a twin (x,x) but have adjacent equal parts.
 * @author Georg Fischer
 */
public class A348382 extends AbstractSequence {

  private int mN = -1;
  private A261983 mSeq1 = new A261983();
  private A059841 mSeq2 = new A059841();

  /** Construct the sequence. */
  public A348382() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (mN == 0) ? Z.ZERO : result;
  }
}
