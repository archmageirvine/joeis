package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000171;
import irvine.oeis.a000.A000595;

/**
 * A055974 Number of unlabeled digraphs with loops (relations) on n nodes and with an odd number of arcs.
 * @author Sean A. Irvine
 */
public class A055974 extends A000595 {

  private final Sequence mA = new A000171();

  @Override
  public Z next() {
    final Z t = mA.next();
    mA.next();
    return super.next().subtract(t).divide2();
  }
}
