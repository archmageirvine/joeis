package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026654 a(n) = T(n,[ n/2 ]), T given by A026648.
 * @author Sean A. Irvine
 */
public class A026654 extends A026648 {

  /** Construct the sequence. */
  public A026654() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
