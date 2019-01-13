package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000111;

/**
 * A001250.
 * @author Sean A. Irvine
 */
public class A001250 extends A000111 {

  @Override
  public Z next() {
    return super.next().shiftLeft(mN <= 1 ? 0 : 1);
  }
}
