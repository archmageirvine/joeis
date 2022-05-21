package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a073.A073120;

/**
 * A057102 a(n) = 4 * A073120(n).
 * @author Sean A. Irvine
 */
public class A057102 extends A073120 {

  @Override
  public Z next() {
    return super.next().multiply(4);
  }
}
