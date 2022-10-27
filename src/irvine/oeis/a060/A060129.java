package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A060128.
 * @author Sean A. Irvine
 */
public class A060129 extends Sequence0 {

  private final Sequence mA = new A060128();
  private final Sequence mB = new A060130();

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
