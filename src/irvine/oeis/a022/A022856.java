package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000217;

/**
 * A022856 a(n) = n-2 + Sum_{i = 1..n-2} (a(i+1) mod a(i)) for n &gt;= 3 with a(1) = a(2) = 1.
 * @author Sean A. Irvine
 */
public class A022856 extends PrependSequence {

  /** Construct the sequence. */
  public A022856() {
    super(1, new A000217() {
      @Override
      public Z next() {
        return super.next().add(2);
      }
    }, 1, 1, 1);
  }
}
