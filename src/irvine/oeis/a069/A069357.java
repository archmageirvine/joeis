package irvine.oeis.a069;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003586;

/**
 * A069357 Numbers of form 2^i*3^j + (i+j) with i, j &gt;= 0.
 * @author Georg Fischer
 */
public class A069357 extends AbstractSequence {

  private final A003586 mSeq1 = new A003586();
  private final A069352 mSeq2 = new A069352();

  /** Construct the sequence. */
  public A069357() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
