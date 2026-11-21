package irvine.oeis.a303;

import irvine.math.z.Z;
import irvine.oeis.a384.A384116;

/**
 * A303208 Number of total dominating sets in the n X n rook graph.
 * @author Gregory Morse
 */
public class A303208 extends A384116 {
  {
    setOffset(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return total(++mN, mN);
  }
}
