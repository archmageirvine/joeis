package irvine.oeis.a322;

import irvine.math.z.Z;
import irvine.oeis.a166.A166590;

/**
 * A322362 a(n) = gcd(n, A166590(n)), where A166590 is completely multiplicative with a(p) = p+2 for prime p.
 * @author Georg Fischer
 */
public class A322362 extends A166590 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.next().gcd(Z.valueOf(mN));
  }
}
