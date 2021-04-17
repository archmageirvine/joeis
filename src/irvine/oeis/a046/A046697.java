package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a038.A038392;
import irvine.oeis.a044.A044046;

/**
 * A046697 Number of catacondensed simply-connected monopentapolyhexes (catafusenes).
 * @author Sean A. Irvine
 */
public class A046697 extends A038392 {

  private final Sequence mA = new A044046();

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
