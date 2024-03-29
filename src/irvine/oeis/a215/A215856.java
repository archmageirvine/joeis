package irvine.oeis.a215;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A215856 Number of simple labeled graphs on n nodes with exactly 6 connected components that are trees or cycles.
 * @author Georg Fischer
 */
public class A215856 extends AbstractSequence {

  private final A215861 mSeq = new A215861();

  /** Construct the sequence. */
  public A215856() {
    super(6);
  }

  private int mN = 5;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 6);
  }
}

