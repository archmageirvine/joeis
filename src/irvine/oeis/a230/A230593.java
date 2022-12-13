package irvine.oeis.a230;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.a069.A069359;

/**
 * A230593 a(n) = n * Sum_{q|n} 1 / q, where q are noncomposite numbers (A008578) dividing n.
 * @author Georg Fischer
 */
public class A230593 extends A069359 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.next().add(mN);
  }
}
