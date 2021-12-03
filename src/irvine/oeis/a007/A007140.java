package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a054.A054976;
import irvine.oeis.a319.A319155;

/**
 * A007140 Number of unlabeled bicolored graphs, with no isolated nodes, on 2n nodes having n nodes of each color and allowing the color classes to be interchanged.
 * @author Sean A. Irvine
 */
public class A007140 extends A319155 {

  private final Sequence mA = new PrependSequence(new A054976(), 1);

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}

