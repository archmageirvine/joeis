package irvine.oeis.a271;
// Generated by gen_seq4.pl anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a049.A049780;
import irvine.oeis.a094.A094728;

/**
 * A271668 Triangle read by rows. The first column is A000217(n+1). From the second row we apply - A002262(n) for the following terms of the row.
 * @author Georg Fischer
 */
public class A271668 extends AbstractSequence {

  private final A094728 mSeq1 = new A094728();
  private final A049780 mSeq2 = new A049780();

  /** Construct the sequence. */
  public A271668() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
