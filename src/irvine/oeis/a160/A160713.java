package irvine.oeis.a160;

import irvine.math.z.Z;
import irvine.oeis.a001.A001316;

/**
 * A160713 3 times numbers of Gould's sequence: a(n) = A001316(n)*3.
 * @author Georg Fischer
 */
public class A160713 extends A001316 {

  @Override
  public Z next() {
    return super.next().multiply(3);
  }
}
