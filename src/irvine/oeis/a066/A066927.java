package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066874.
 * @author Sean A. Irvine
 */
public class A066927 extends A000040 {

  @Override
  public Z next() {
    return super.next().divide2().sqrt().add(1);
  }
}
