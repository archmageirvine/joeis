package irvine.oeis.a248;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A248038 3n concatenated with itself.
 * @author Georg Fischer
 */
public class A248038 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new Z(String.valueOf(3 * mN) + String.valueOf(3 * mN));
  }
}
