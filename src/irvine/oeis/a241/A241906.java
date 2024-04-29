package irvine.oeis.a241;


import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A241906 a(n) = floor(bell(2n)/bell(n)^2), bell = A000110.
 * @author Georg Fischer
 */
public class A241906 extends Sequence0 {
  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.BELL.z(2 * mN).divide(Functions.BELL.z(mN).square());
  }
}
