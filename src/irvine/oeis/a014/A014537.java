package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a002.A002387;

/**
 * A014537 Number of books required for n book-lengths of overhang in the harmonic book stapling problem. <code>Sum_{i=1..a(n)} 1/i &gt;= 2n</code> and <code>Sum_{i=1..a(n)-1} 1/i &lt; 2n</code>.
 * @author Sean A. Irvine
 */
public class A014537 extends A002387 {

  @Override
  public Z next() {
    if (Z.ONE.equals(super.next())) {
      super.next();
    }
    return super.next();
  }
}
