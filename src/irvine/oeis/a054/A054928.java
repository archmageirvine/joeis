package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000273;
import irvine.oeis.a003.A003086;

/**
 * A054928 Number of complementary pairs of directed graphs on n nodes. Also number of unlabeled digraphs with n nodes and an even number of arcs.
 * @author Sean A. Irvine
 */
public class A054928 extends A003086 {

  private final Sequence mA = new A000273().skip(1);

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}
