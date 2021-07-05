package irvine.oeis.a147;
// manually at 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a061.A061042;

/**
 * A147792 A quadrisection of A061042.
 * @author Georg Fischer
 */
public class A147792 extends A061042 {

  /** Construct the sequence. */
  public A147792() {
  }
  
  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    super.next();
    return result;
  }
}
