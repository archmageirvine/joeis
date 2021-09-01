package irvine.oeis.a054;
// manually divmul at 2021-08-20 23:36

import irvine.math.z.Z;
import irvine.oeis.a000.A000016;

/**
 * A054539 A000016 / 2.
 * @author Georg Fischer
 */
public class A054539 extends A000016 {

  /** Construct the sequence. */
  public A054539() {
    super.next();
    super.next();
    super.next();
  }
  
  @Override
  public Z next() {
    return super.next().divide(2);
  }
}
