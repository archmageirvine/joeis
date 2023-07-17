package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a002.A002387;

/**
 * A056054 a(n) = smallest even number 2m such that value of odd harmonic series Sum_{j=0..m} 1/(2j) is &gt; n.
 * @author Sean A. Irvine
 */
public class A056054 extends A002387 {

  /** Construct the sequence. */
  public A056054() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    return super.next().multiply2();
  }
}
