package irvine.oeis.a085;

import irvine.oeis.Combiner;
import irvine.oeis.a048.A048996;
import irvine.oeis.a118.A118851;

/**
 * A085643 Irregular triangle T(n,k) = A048996(n,k) * A118851(n,k), read by rows, 1 &lt;= k &lt;= A000041(n).
 * @author Sean A. Irvine
 */
public class A085643 extends Combiner {

  /** Construct the sequence. */
  public A085643() {
    super(0, new A048996(), new A118851(), MULTIPLY);
  }
}
