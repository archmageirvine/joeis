package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066366.
 * @author Sean A. Irvine
 */
public class A066371 extends A066392 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

