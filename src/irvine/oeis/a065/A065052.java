package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005132;

/**
 * A065052 Let R(n) = n-th term of Recam\u00e1n's sequence A005132; write R(n) = q*n + r with 0 &lt;= r &lt; n; sequence gives values of r.
 * @author Sean A. Irvine
 */
public class A065052 extends Sequence1 {

  private final Sequence mA = new A005132().skip();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mA.next().mod(++mN));
  }
}

