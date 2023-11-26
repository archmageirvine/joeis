package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A059927 Period of the continued fraction for sqrt(2^(2n+1)).
 * @author Sean A. Irvine
 */
public class A059927 extends A003285 {

  /** Construct the sequence. */
  public A059927() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return period(Z.ONE.shiftLeft(mN));
  }
}
