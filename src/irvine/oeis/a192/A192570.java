package irvine.oeis.a192;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A192570 a(n) = floor(sqrt(Bell(n))).
 * @author Georg Fischer
 */
public class A192570 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.BELL.z(mN).sqrt();
  }
}
