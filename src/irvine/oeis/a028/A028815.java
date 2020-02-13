package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a008.A008578;

/**
 * A028815 <code>a(n) = n-th</code> prime <code>+ 1</code> (starting with <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A028815 extends A008578 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
