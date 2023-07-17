package irvine.oeis.a134;
// manually 2021-01-20

import irvine.math.z.Z;
import irvine.oeis.a000.A000931;

/**
 * A134732 Concatenation of first n members of the Padovan sequence A000931, starting at (1, 1, 1, 2,).
 * @author Georg Fischer
 */
public class A134732 extends A000931 {

  protected final StringBuilder mConc = new StringBuilder();

  /** Construct the sequence. */
  public A134732() {
    super(1);
    for (int i = 0; i <= 4; ++i) {
      super.next();
    }
  }

  @Override
  public Z next() {
    mConc.append(super.next());
    return new Z(mConc);
  }

}
