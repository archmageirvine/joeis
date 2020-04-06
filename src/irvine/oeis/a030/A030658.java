package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a095.A095916;

/**
 * A030658 1 iff n-th digit of <code>Pi</code> is <code>&gt;= (n+1)st</code> digit.
 * @author Sean A. Irvine
 */
public class A030658 extends A095916 {

  @Override
  public Z next() {
    return super.next().signum() <= 0 ? Z.ONE : Z.ZERO;
  }
}

