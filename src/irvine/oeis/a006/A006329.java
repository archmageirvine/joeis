package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a079.A079502;

/**
 * A006329 Total preorders.
 * @author Sean A. Irvine
 */
public class A006329 extends A079502 {

  /** Construct the sequence. */
  public A006329() {
    super(3);
  }

  private int mN = 3;

  @Override
  public Z next() {
    return u(++mN, mN - 2);
  }
}

