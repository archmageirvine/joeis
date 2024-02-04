package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A010888 Digital root of n (repeatedly add the digits of n until a single digit is reached).
 * @author Sean A. Irvine
 */
public class A010888 extends PrependSequence implements DirectSequence {

  /** Construct the sequence. */
  public A010888() {
    super(new PeriodicSequence(1, 2, 3, 4, 5, 6, 7, 8, 9), Z.ZERO);
  }

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ZERO : n.subtract(1).modZ(9).add(1);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}

