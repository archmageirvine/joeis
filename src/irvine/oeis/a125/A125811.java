package irvine.oeis.a125;
// manually dersimple at 2021-08-25 19:44

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a023.A023536;

/**
 * A125811 Number of coefficients in the n-th q-Bell number as a polynomial in q.
 * @author Georg Fischer
 */
public class A125811 extends AbstractSequence {

  private final A023536 mSeq1 = new A023536();

  /** Construct the sequence. */
  public A125811() {
    super(0);
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return mN <= 3 ? Z.ONE : mSeq1.next().add(1);
  }
}
