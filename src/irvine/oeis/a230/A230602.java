package irvine.oeis.a230;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A230602 a(n) = Lucas(2^n - 2).
 * @author Georg Fischer
 */
public class A230602 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.lucas((1L << mN) - 2);
  }
}
