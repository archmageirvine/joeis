package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054954 Number of unlabeled semi-strong digraphs on n nodes with an even number of pairwise different components.
 * @author Sean A. Irvine
 */
public class A054954 extends A054951 {

  private final Sequence mA = new A054952();

  @Override
  public Z next() {
    return mA.next().subtract(super.next()).divide2();
  }
}
