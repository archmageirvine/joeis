package irvine.oeis.a364;
// manually 2023-09-24/inverti at 2023-09-24 20:22

import irvine.math.z.Z;
import irvine.oeis.a005.A005789;
import irvine.oeis.transform.InverseInvertTransform;

/**
 * A364439 a(n) is the number of paths with length 3*n that begin at (0,0), end at (0,0), and do not reach (0,0) at any point in between while 0 &lt;= y &lt;= x at every step, where a path is a sequence of steps in the form (1,1), (1,-1), and (-2,0).
 * @author Georg Fischer
 */
public class A364439 extends InverseInvertTransform {

  private int mN = -1;

  /** Construct the sequence. */
  public A364439() {
    super(0, new A005789().skip(1));
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : super.next();
  }
}
