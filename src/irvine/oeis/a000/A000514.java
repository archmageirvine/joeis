package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000514 Eulerian numbers (Euler's triangle: column k=6 of A008292, column k=5 of A173018).
 * @author Sean A. Irvine
 */
public class A000514 extends AbstractSequence {

  /* Construct the sequence. */
  public A000514() {
    super(6);
  }

  private int mN = 6;
  private Z prod(final int n, final int i) {
    Z p = Z.ONE;
    for (int j = 1; j <= i; ++j) {
      p = p.multiply(n + 1L - j);
    }
    return p;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.SIX.pow(mN - 1)
      .subtract(Z.FIVE.pow(mN - 1).multiply(prod(mN, 1)))
      .add(Z.FOUR.pow(mN - 1).multiply(prod(mN, 2).divide2()))
      .subtract(Z.THREE.pow(mN - 1).multiply(prod(mN, 3).divide(6)))
      .add(Z.TWO.pow(mN - 1).multiply(prod(mN, 4).divide(24)))
      .subtract(prod(mN, 5).divide(120));
  }
}
