package irvine.oeis.a116;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a054.A054780;
import irvine.oeis.a088.A088389;

/**
 * A116532 Number of singular n X n rational {0,1}-matrices with no zero rows or columns and with all rows distinct, up to permutation of rows.
 * @author Georg Fischer
 */
public class A116532 extends AbstractSequence {

  private A054780 mSeq1 = new A054780();
  private A088389 mSeq2 = new A088389();

  /** Construct the sequence. */
  public A116532() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
