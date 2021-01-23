package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004074 a(n) = 2*A004001(n) - n, where A004001 is the Hofstadter-Conway $10000 sequence.
 * @author Sean A. Irvine
 */
public class A004074 extends A004001 {

  @Override
  public Z next() {
    return super.next().multiply2().subtract(size());
  }

}
