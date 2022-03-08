package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a004.A004215;

/**
 * A055039 Numbers of the form 2^(2i+1)*(8j+7).
 * @author Sean A. Irvine
 */
public class A055039 extends A004215 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
