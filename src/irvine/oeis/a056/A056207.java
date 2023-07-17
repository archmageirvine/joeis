package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a003.A003095;

/**
 * A056207 Number of binary trees of height &lt;= n.
 * @author Sean A. Irvine
 */
public class A056207 extends A003095 {

  /** Construct the sequence. */
  public A056207() {
    super(1);
  }

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
