package irvine.oeis.a086;
// manually 2026-07-04/charfunc at 2026-07-04 22:03

import irvine.math.z.Z;
import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a060.A060142;

/**
 * A086747 Baum-Sweet sequence: a(n) = 1 if binary representation of n contains no block of consecutive zeros of odd length; otherwise a(n) = 0.
 * @author Georg Fischer
 */
public class A086747 extends CharacteristicFunction {

  private int mN = 0;

  /** Construct the sequence. */
  public A086747() {
    super(0, new A060142());
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().subtract((mN == 1) ? 1 : 0);
  }
}
