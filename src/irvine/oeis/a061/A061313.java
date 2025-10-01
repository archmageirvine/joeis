package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a029.A029837;
import irvine.oeis.a080.A080791;

/**
 * A061313 Minimal number of steps to get from 1 to n by (a) subtracting 1 or (b) multiplying by 2.
 * @author Georg Fischer
 */
public class A061313 extends Sequence1 {

  private final Sequence mA029837 = new A029837();
  private final Sequence mA080791 = new A080791();

  @Override
  public Z next() {
    return mA080791.next().add(mA029837.next());
  }

}
