package irvine.oeis.a069;
// manually binomx at 2023-06-01 10:26

import irvine.math.z.Z;
import irvine.oeis.a000.A000312;
import irvine.oeis.transform.BinomialTransform;

/**
 * A069856 E.g.f.: exp(x)/(1+LambertW(x)).
 * @author Georg Fischer
 */
public class A069856 extends BinomialTransform {

  private int mN = -1;

  /** Construct the sequence. */
  public A069856() {
    super(0, new A000312(), 0, true);
  }

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 1) ? super.next().negate() : super.next();
  }
}
