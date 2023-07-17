package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000392;

/**
 * A006230 Bitriangular permutations.
 * @author Sean A. Irvine
 */
public class A006230 extends A000392 {

  /** Construct the sequence. */
  public A006230() {
    super(4);
  }

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(12).add(1);
  }
}
