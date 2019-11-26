package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004074 <code>a(n) = 2*A004001(n) -</code> n, where <code>A004001</code> is the <code>Hofstadter-Conway $10000</code> sequence.
 * @author Sean A. Irvine
 */
public class A004074 extends A004001 {

  @Override
  public Z next() {
    return super.next().multiply2().subtract(size());
  }

}
