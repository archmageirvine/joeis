package irvine.oeis.a193;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.triangle.Triangle;

/**
 * A193673 Triangle given by p(n,k)=(coefficient of x^(n-k) in (1/2) ((x+3)^n+(x+1)^n)), 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A193673 extends Sequence0 {

  private Z[] mLine = new Z[0];
  private final Triangle mTri = new Triangle();
  private int mR = -1; // current row
  private int mC = -1; // current column

  /**
   * Return next term, reading the triangle row by row from left to right, starting with T(0, 0).
   * @return the next term of the sequence.
   */
  @Override
  public Z next() {
    if (++mC > mR) {
      ++mR;
      mC = 0;
      mLine = new Z[mR + 1];
      Z pow3 = Z.ONE;
      for (int k = 0; k <= mR; ++k) {
        final Z binom = mTri.next();
        mLine[mR - k] = binom.add(binom.multiply(pow3));
        pow3 = pow3.multiply(3);
      }
    }
    return mLine[mC].divide2();
  }
}
