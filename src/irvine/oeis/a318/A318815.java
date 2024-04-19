package irvine.oeis.a318;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000110;
import irvine.oeis.transform.LogarithmicTransformSequence;

/**
 * A318815 Number of triples of set partitions of {1,2,...,n} whose join is {{1,2,...,n}}.
 * @author Georg Fischer
 */
public class A318815 extends AbstractSequence {

  private final LogarithmicTransformSequence mSeq1 = new LogarithmicTransformSequence(new Sequence0() {
    private final A000110 mBell = new A000110();

    @Override
    public Z next() {
      return mBell.next().pow(3);
    }
  }, 1);

  /** Construct the sequence. */
  public A318815() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
