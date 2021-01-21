package irvine.oeis.a134;
// manually 2021-01-20

import irvine.math.z.Z;
import irvine.oeis.a000.A000931;

/**
 * A134732 Concatenation of first n members of the Padovan sequence A000931, starting at (1, 1, 1, 2,).
 * @author Georg Fischer
 */
public class A134732 extends A000931 {

  protected String mConc;

  /** Construct the sequence. */
  public A134732() {
    for (int i = 0; i <= 4; ++i) {
      super.next();
    }
    mConc = "";
  }

  @Override
  public Z next() {
    mConc += super.next().toString();
    return new Z(mConc);
  }

}
