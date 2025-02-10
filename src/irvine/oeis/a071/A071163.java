package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A071163 A014486-indices for rooted binary trees with height equal to number of internal vertices. (Binary trees where at each internal vertex at least the other child is leaf.).
 * @author Sean A. Irvine
 */
public class A071163 extends A071162 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(super.next());
  }
}
