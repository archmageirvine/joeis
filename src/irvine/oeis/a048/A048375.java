package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a039.A039686;

/**
 * A048375 Numbers n such that n^2 is a concatenation of two nonzero squares.
 * @author Sean A. Irvine
 */
public class A048375 extends A039686 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
