package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a014.A014284;

/**
 * A036439 a(n) = a(n-1) + prime(n-1), with a(1)=2.
 * @author Sean A. Irvine
 */
public class A036439 extends A014284 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
