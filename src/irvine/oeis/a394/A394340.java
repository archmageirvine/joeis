package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001412;
import irvine.oeis.a046.A046171;

/**
 * A394340 Number of self-avoiding walks on the cubic lattice with the first three orthogonal steps specified (see Comments).
 * @author Sean A. Irvine
 */
public class A394340 extends Sequence1 {

  private final Sequence mA = new A001412().skip();
  private final Sequence mB = new A046171();

  @Override
  public Z next() {
    return mA.next().add(mB.next().multiply(24)).add(18).divide(48);
  }
}
