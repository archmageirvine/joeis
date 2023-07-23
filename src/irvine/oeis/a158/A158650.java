package irvine.oeis.a158;
// manually 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a061.A061041;

/**
 * A158650 Indices of single-digit numbers in A061041.
 * @author Georg Fischer
 */
public class A158650 extends AbstractSequence {

  private final A061041 mSeq1 = new A061041();

  private int mN;

  /** Construct the sequence. */
  public A158650() {
    super(1);
    mN = 3;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mSeq1.next().compareTo(Z.TEN) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
