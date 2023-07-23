package irvine.oeis.a097;
// manually knestm/knest at 2023-03-02 19:24

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006337;

/**
 * A097509 a(n) is the number of times that n occurs as floor(k * sqrt(2)) - k.
 * @author Georg Fischer
 */
public class A097509 extends AbstractSequence {

  private final A006337 mSeq1 = new A006337();

  /** Construct the sequence. */
  public A097509() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN <= 0) ? Z.THREE : mSeq1.next().add(1);
  }
}
