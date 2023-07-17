package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a025.A025179;

/**
 * A024997 a(n) = number of (s(0), s(1), ..., s(n)) such that every s(i) is an integer, s(0) = 0 = s(n), |s(i) - s(i-1)| = 1 for i = 1,2; |s(i) - s(i-1)| &lt;= 1 for i &gt;= 3. Also a(n) = T(n,n), where T is the array defined in A024996.
 * @author Sean A. Irvine
 */
public class A024997 extends A025179 {

  /** Construct the sequence. */
  public A024997() {
    super(3);
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
