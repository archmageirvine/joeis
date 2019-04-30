package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004074 <code>a(n) =</code> 2*A004001(n) <code>- n</code>, where A004001 is Hofstadter-Conway $10000 sequence.
 * @author Sean A. Irvine
 */
public class A004074 extends A004001 {

  @Override
  public Z next() {
    return super.next().multiply2().subtract(size());
  }

}
