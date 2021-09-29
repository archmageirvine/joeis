package irvine.oeis.a133;
// manually partsum at 2021-09-28

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a047.A047835;

/**
 * A133708 First differences of A047835.
 * @author Georg Fischer
 */
public class A133708 extends DifferenceSequence {

  protected long mN = 0;

  /** Construct the sequence. */
  public A133708() {
    super(new A047835());
  }

  @Override
  public Z next() {
    ++mN;
    return mN <= 2 ? Z.ZERO : (mN == 3 ? Z.ONE : super.next());
  }
}
