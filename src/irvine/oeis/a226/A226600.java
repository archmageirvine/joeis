package irvine.oeis.a226;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003215;
import irvine.oeis.a061.A061201;

/**
 * A226600 Number of ordered triples (i,j,k) with i*j*k &lt;= n and i,j,k &gt;= 0.
 * @author Georg Fischer
 */
public class A226600 extends AbstractSequence {

  private int mN = -1;
  private final A003215 mSeq1 = new A003215();
  private final A061201 mSeq2 = new A061201();

  /** Construct the sequence. */
  public A226600() {
    super(0);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : mSeq1.next().add(mSeq2.next());
  }
}
