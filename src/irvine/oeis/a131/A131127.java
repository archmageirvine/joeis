package irvine.oeis.a131;
// manually trisum/trisum2 at 2023-06-07 08:41

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007318;
import irvine.oeis.a167.A167374;

/**
 * A131127 Table read by rows: 2*A007318(n,m) - A167374(n,m).
 * @author Georg Fischer
 */
public class A131127 extends AbstractSequence {

  private final A007318 mSeq1 = new A007318();
  private final A167374 mSeq2 = new A167374();

  /** Construct the sequence. */
  public A131127() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply2().subtract(mSeq2.next());
  }
}
