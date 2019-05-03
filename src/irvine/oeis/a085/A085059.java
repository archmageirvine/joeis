package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a008.A008344;

/**
 * A085059 <code>a(1) = 1, a(n+1) = a(n)-n</code> if <code>a(n) &gt; n</code> else <code>a(n+1) = a(n) +</code> n.
 * @author Sean A. Irvine
 */
public class A085059 extends A008344 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}


