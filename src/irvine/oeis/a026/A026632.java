package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026632 T(n,[ n/2 ]), T given by A026626.
 * @author Sean A. Irvine
 */
public class A026632 extends A026626 {

  /** Construct the sequence. */
  public A026632() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
