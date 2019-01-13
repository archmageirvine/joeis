package irvine.oeis.a005;

import java.io.Serializable;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005130.
 * @author Sean A. Irvine
 */
public class A005130 implements Sequence, Serializable {

  private int mN = -1;
  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    ++mN;
    Z num = Z.ONE;
    Z den = Z.ONE;
    for (int k = 0; k < mN; ++k) {
      num = num.multiply(mF.factorial(3 * k + 1));
      den = den.multiply(mF.factorial(mN + k));
    }
    return num.divide(den);
  }
}

