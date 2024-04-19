package irvine.oeis.a275;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a004.A004442;

/**
 * A275238 a(n) = n*(10^floor(log_10(n)+1) + 1) + (-1)^n.
 * @author Georg Fischer
 */
public class A275238 extends AbstractSequence {

  private int mN = -1;
  private final A004442 mSeq1 = new A004442();

  /** Construct the sequence. */
  public A275238() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return new Z(mN + mSeq1.next().toString());
  }
}
