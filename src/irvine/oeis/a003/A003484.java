package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003484 Radon function, also called Hurwitz-Radon numbers.
 * @author Sean A. Irvine
 */
public class A003484 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    mN.makeOdd();
    final long power = mN.auxiliary();
    final int c = (int) (power & 3);
    return Z.ONE.shiftLeft(c).add(2 * (power & ~3));
  }
}

