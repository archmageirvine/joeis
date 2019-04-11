package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a003.A003849;

/**
 * A014675 The infinite Fibonacci word (start with <code>1,</code> apply <code>1-&gt;2, 2-&gt;21,</code> take limit).
 * @author Sean A. Irvine
 */
public class A014675 extends A003849 {

  @Override
  public Z next() {
    return Z.TWO.subtract(super.next());
  }
}

