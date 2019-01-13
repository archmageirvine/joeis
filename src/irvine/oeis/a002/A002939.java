package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000384;

/**
 * A002939.
 * @author Sean A. Irvine
 */
public class A002939 extends A000384 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
