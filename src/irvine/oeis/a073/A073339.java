package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073339 Define b(k) by the recursion b(1)=n, b(k+1)=b(k)-trunc(k/b(k)), where trunc(x) is floor(x) for x&gt;=0, ceiling(x) for x&lt;0. Sequence gives the value a(n) such that b(a(n))=0; if k&gt;a(n) then b(k) is undefined.
 * @author Sean A. Irvine
 */
public class A073339 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long k = 0;
    while (true) {
      m -= ++k / m;
      if (m == 0) {
        return Z.valueOf(k + 1);
      }
    }
  }
}

