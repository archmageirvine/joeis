package irvine.oeis.a359;
// manually n2 at 2023-05-02 19:56

import irvine.math.z.Z;
import irvine.oeis.a035.A035327;

/**
 * A359194 Binary complement of 3n.
 * @author Georg Fischer
 */
public class A359194 extends A035327 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
