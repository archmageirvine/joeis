package irvine.oeis.a155;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a028.A028362;

/**
 * A155104 Numbers appearing in the fourth column of A155103.
 * @author Georg Fischer
 */
public class A155104 extends Sequence1 {

  private final Sequence mA028362 = new A028362().skip(2);

  @Override
  public Z next() {
    return mA028362.next().divide(Z.THREE);
  }
}
