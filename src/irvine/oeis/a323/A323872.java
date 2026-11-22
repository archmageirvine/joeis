package irvine.oeis.a323;

import irvine.math.z.Z;

/**
 * A323872 Number of n X n aperiodic binary toroidal necklaces.
 * @author Gregory Morse
 */
public class A323872 extends A323861 {
  private int mN = -1;

  /** Construct the sequence. */
  public A323872() {
    setOffset(0);
  }

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : aperiodic(mN, mN);
  }
}
