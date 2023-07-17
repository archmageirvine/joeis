package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a079.A079502;

/**
 * A006326 Total preorders.
 * @author Sean A. Irvine
 */
public class A006326 extends A079502 {

  /** Construct the sequence. */
  public A006326() {
    super(3);
  }

  private int mN = 2;

  @Override
  public Z next() {
    return u(++mN, mN - 1);
  }
}

