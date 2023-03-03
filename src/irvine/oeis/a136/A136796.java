package irvine.oeis.a136;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.a052.A052764;

/**
 * A136796 Number of labeled marked rooted trees with n nodes.
 * @author Georg Fischer
 */
public class A136796 extends A052764 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
