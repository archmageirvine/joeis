package irvine.oeis.a256;
// manually, charfun at 2021-06-22 17:32

import irvine.math.z.Z;
import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a006.A006564;

/**
 * A256434 Characteristic function of icosahedral numbers.
 * @author Georg Fischer
 */
public class A256434 extends CharacteristicFunction {

  protected int mN;

  /** Construct the sequence. */
  public A256434() {
    super(1, new A006564());
    setOffset(0);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return mN < 1 ? Z.ONE : super.next();
  }
}
