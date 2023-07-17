package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a002.A002193;

/**
 * A010527 Decimal expansion of sqrt(3)/2.
 * @author Sean A. Irvine
 */
public class A010527 extends A002193 {

  /** Construct the sequence. */
  public A010527() {
    super(0);
  }

  @Override
  protected Z n() {
    return Z.valueOf(75);
  }
}
