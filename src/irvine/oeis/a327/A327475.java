package irvine.oeis.a327;
// manually dersimple at 2021-09-27 18:28

import irvine.math.z.Z;
import irvine.oeis.a051.A051293;

/**
 * A327475 Number of subsets of {1..n} whose mean is an integer, where {} has mean 0.
 * @author Georg Fischer
 */
public class A327475 extends A051293 {

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ONE : super.next().add(1);
  }
}
