package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a005.A005753;

/**
 * A038077 Number of rooted identity trees with 2-colored nodes.
 * @author Sean A. Irvine
 */
public class A038077 extends A005753 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
