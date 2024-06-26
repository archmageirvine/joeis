package irvine.oeis.a079;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a066.A066839;
import irvine.oeis.a070.A070038;

/**
 * A079667 a(n) = (1/2) * Sum_{d divides n} abs(n/d-d).
 * @author Georg Fischer
 */
public class A079667 extends AbstractSequence {

  private final A070038 mSeq1 = new A070038();
  private final A066839 mSeq2 = new A066839();

  /** Construct the sequence. */
  public A079667() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
