package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054953 Number of unlabeled semi-strong digraphs on n nodes with an odd number of pairwise different components.
 * @author Sean A. Irvine
 */
public class A054953 extends A054951 {

  private final Sequence mA = new A054952();

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}
