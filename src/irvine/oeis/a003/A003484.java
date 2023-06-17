package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003484 Radon function, also called Hurwitz-Radon numbers.
 * @author Sean A. Irvine
 */
public class A003484 extends AbstractSequence {

  /* Construct the sequence. */
  public A003484() {
    super(1);
  }

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

