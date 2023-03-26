package irvine.oeis.a092;
// manually deris/partprod at 2023-03-24 13:24

import irvine.math.z.Z;
import irvine.oeis.PartialProductSequence;
import irvine.oeis.a061.A061214;

/**
 * A092435 Prime factorials divided by their corresponding primorials.
 * @author Georg Fischer
 */
public class A092435 extends PartialProductSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A092435() {
    super(1, new A061214());
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 1) ? Z.ONE : super.next();
  }

}
