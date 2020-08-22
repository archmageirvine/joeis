package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a210.A210696;


/**
 * A002711 Triangulations of the disk G_{n,2}.
 * @author Sean A. Irvine
 */
public class A002711 implements Sequence {

  private final A210696 mA = new A210696();
  private int mN = -1;

  @Override
  public Z next() {
    return mA.brownG(++mN, 2);
  }
}
