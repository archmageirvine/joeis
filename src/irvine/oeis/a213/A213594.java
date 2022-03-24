package irvine.oeis.a213;
// manually valuation/valuat at 2022-03-16 13:50

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a048.A048784;

/**
 * A213594 Greatest number k such that A048784(n) / 2^k is an integer.
 * @author Georg Fischer
 */
public class A213594 extends A048784 {

  /** Construct the sequence. */
  public A213594() {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.valuation(super.next(), Z.TWO));
  }
}
