package irvine.oeis.a208;

import irvine.math.z.Z;
import irvine.oeis.a073.A073617;

/**
 * A208649 (1/n)*A073617(n+1).
 * @author Georg Fischer
 */
public class A208649 extends A073617 {

  private int mN = 0;

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
