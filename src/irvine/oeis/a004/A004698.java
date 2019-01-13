package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A004698.
 * @author Sean A. Irvine
 */
public class A004698 extends A000045 {

  @Override
  public Z next() {
    return super.next().divide(5);
  }
}

