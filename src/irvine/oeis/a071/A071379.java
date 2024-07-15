package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a090.A090210;

/**
 * A071291.
 * @author Sean A. Irvine
 */
public class A071379 extends A090210 {

  private int mN = 2;

  /** Construct the sequence. */
  public A071379() {
    super(0);
  }

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}
