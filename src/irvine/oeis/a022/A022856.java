package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000217;

/**
 * A022856 <code>a(n) = n-2 +</code> Sum of <code>a(i+1) mod(a(i))</code> for i <code>= 1</code> to <code>n-2</code>, for <code>n &gt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A022856 extends PrependSequence {

  /** Construct the sequence. */
  public A022856() {
    super(new A000217() {
      @Override
      public Z next() {
        return super.next().add(2);
      }
    }, 1, 1, 1);
  }
}
