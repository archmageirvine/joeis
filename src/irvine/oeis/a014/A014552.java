package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a176.A176127;

/**
 * A014552 Number of solutions to Langford (or Langford-Skolem) problem (up to reversal of the order).
 * @author Sean A. Irvine
 */
public class A014552 extends A176127 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
