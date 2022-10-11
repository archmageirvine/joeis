package irvine.oeis.a156;

import irvine.math.z.Z;
import irvine.oeis.a008.A008683;

/**
 * A156277 Numbers appearing at every third row in the third column of A156241.
 * @author Georg Fischer
 */
public class A156277 extends A008683 {

  @Override
  public Z next() {
    super.next();
    super.next();
    return super.next().negate();
  }
}
