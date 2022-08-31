package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.CharacteristicFunction;
import irvine.oeis.PrependSequence;
import irvine.oeis.a013.A013929;

/**
 * A123740 Characteristic sequence for numbers n>=0 that are either squares or have a square > 1 as factor.
 * @author Georg Fischer
 */
public class A087049 extends CharacteristicFunction {

  private int mN;

  /** Construct the sequence. */
  public A087049() {
    super(0, new PrependSequence(new A013929(), 0));
    mN = -2;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == -1) {
      return Z.ONE;
    }
    if (mN == 0) {
      super.next();
      super.next();
      return Z.ONE;
    }
    return super.next();
  }
}
