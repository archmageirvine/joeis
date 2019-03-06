package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A019280.
 * @author Sean A. Irvine
 */
public class A019280 extends A000043 {

  // Conjectural -- do not use this to extend the sequence

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

