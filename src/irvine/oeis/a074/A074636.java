package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074636 Define b(k) by the recursion b(1)=n, b(k+1)=b(k)-floor(k/b(k)). Sequence gives the value a(n) such that b(a(n))=0; if k&gt;a(n) then b(k) is undefined.
 * @author Sean A. Irvine
 */
public class A074636 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long b = ++mN;
    long k = 0;
    while (b != 0) {
      b -= Math.floorDiv(++k, b);
    }
    return Z.valueOf(k + 1);
  }
}
