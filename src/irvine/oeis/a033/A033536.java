package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A033536 Cubes of Catalan numbers (A000108).
 * @author Sean A. Irvine
 */
public class A033536 extends A000108 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
