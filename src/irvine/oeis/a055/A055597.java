package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a048.A048855;

/**
 * A055597 Exponent of the highest power of 2 dividing phi(n!).
 * @author Sean A. Irvine
 */
public class A055597 extends A048855 {

  /** Construct the sequence. */
  public A055597() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(super.next().makeOdd().auxiliary());
  }
}
