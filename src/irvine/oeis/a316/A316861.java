package irvine.oeis.a316;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000097;
import irvine.oeis.a116.A116646;

/**
 * A316861 a(n) = Sum_{p in P} y(1)*y(2), where P is the set of partitions of n, and y(k) is the number of parts with multiplicity at least k in p.
 * @author Georg Fischer
 */
public class A316861 extends AbstractSequence {

  private int mN = -1;
  private A000097 mSeq1 = new A000097();
  private A116646 mSeq2 = new A116646();

  /** Construct the sequence. */
  public A316861() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN <= 2) ? mSeq2.next() : mSeq1.next().add(mSeq2.next());
  }
}
