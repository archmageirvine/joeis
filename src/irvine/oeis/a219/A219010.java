package irvine.oeis.a219;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A219010 Numerators in a product expansion for sqrt(5).
 * @author Georg Fischer
 */
public class A219010 extends Sequence0 {

  private int mA5 = 2;

  @Override
  public Z next() {
    final Z result = Functions.LUCAS.z(mA5);
    mA5 *= 5;
    return result;
  }
}
