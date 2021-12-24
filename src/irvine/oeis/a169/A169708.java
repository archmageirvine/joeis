package irvine.oeis.a169;
// manually ca2elem/diffseq at 2021-12-23 19:20

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;

/**
 * A169708 First differences of A169707.
 * @author Georg Fischer
 */
public class A169708 extends DifferenceSequence {

  private int mN;

  /** Construct the sequence. */
  public A169708() {
    super(new A169707());
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    return super.next();
  }
}
