package irvine.oeis.a270;

import irvine.math.z.Z;

/**
 * A270228 Number of matchings in the n X n rook graph K_n X K_n.
 * @author Gregory Morse
 */
public class A270228 extends A270227 {
  private int mN = 0;

  @Override
  public Z next() {
    return matchings(++mN, mN);
  }
}
