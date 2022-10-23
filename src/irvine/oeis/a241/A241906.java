package irvine.oeis.a241;


import irvine.math.z.BellNumbers;
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
    return BellNumbers.bell(2 * mN).divide(BellNumbers.bell(mN).square());
  }
}
