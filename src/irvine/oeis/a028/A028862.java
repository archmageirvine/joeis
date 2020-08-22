package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A028862 [ sin(Fibonacci(n)) ].
 * @author Sean A. Irvine
 */
public class A028862 extends A000045 {

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.sin(CR.valueOf(super.next())).floor();
  }
}
