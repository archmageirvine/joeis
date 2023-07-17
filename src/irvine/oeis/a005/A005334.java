package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a123.A123301;

/**
 * A005334 Number of labeled nonseparable (or 2-connected) bicolored graphs with n nodes of the first color and n nodes of the second color.
 * @author Sean A. Irvine
 */
public class A005334 extends A123301 {

  /** Construct the sequence. */
  public A005334() {
    super(1);
  }

  protected int mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
