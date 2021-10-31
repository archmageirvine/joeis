package irvine.oeis.a130;

import irvine.math.z.Z;
import irvine.oeis.a056.A056951;

/**
 * A130517 Triangle read by rows: row n counts down from n in steps of 2, then counts up the remaining elements in the set {1,2,...n}, again in steps of 2.
 * then counts up the remaining elements in the set {1, 2,...n}, again in steps of 2.
 * T(1, 1)=1, for n&gt;1: T(n, 1)=T(n-1, 1)+1 and T(n,k)=T(n-1,n-k+1), 1&lt;k<=n
 * @author Georg Fischer
 */
public class A130517 extends A056951 {

  @Override
  public Z next() {
    return super.next().abs();
  }
}
