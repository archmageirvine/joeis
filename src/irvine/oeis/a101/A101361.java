package irvine.oeis.a101;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A101361 a(1) = a(2) = 1; for n &gt; 2, a(n) = Knuth's Fibonacci (or circle) product "a(n-1) o a(n-2)".
 * @author Georg Fischer
 */
public class A101361 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Functions.FIBONACCI.z(Functions.FIBONACCI.z(mN).multiply2());
  }
}
