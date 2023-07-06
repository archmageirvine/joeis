package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000273;
import irvine.oeis.a002.A002499;

/**
 * A054933 Number of unlabeled digraphs on n nodes up to reversing the arcs.
 * @author Sean A. Irvine
 */
public class A054933 extends A002499 {

  private final Sequence mA = new A000273().skip(1);

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}
