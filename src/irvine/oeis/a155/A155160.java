package irvine.oeis.a155;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A155160 a(n) = 2^n * (n + 3)!!.
 * @author Georg Fischer
 */
public class A155160 extends Sequence0 {

  private int mN = -1;

  /** Construct the sequence. */
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).multiply(Functions.MULTIFACTORIAL.z(mN + 3));
  }
}
