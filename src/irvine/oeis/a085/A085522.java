package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A085522 Product_{k=0..n} (3^(2k+1)+1).
 * @author Georg Fischer
 */
public class A085522 extends AbstractSequence {

  /** Construct the sequence. */
  public A085522() {
    super(-1);
  }

  private int mN = -2;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      prod = prod.multiply(Z.THREE.pow(2L * k + 1).add(1));
    }
    return prod;
  }
}
