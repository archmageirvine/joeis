package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a090.A090345;

/**
 * A039984 An example of a d-perfect sequence.
 * @author Georg Fischer
 */
public class A039984 extends A090345 {

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return super.next().isEven() ? Z.ZERO : Z.ONE;
  }
}
