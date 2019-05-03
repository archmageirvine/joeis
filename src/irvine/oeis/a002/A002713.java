package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002713 Triangulations of the disk <code>R_{n,0}</code>.
 * @author Sean A. Irvine
 */
public class A002713 extends A002712 {

  private final A002709 mA = new A002709();

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}

