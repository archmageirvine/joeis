package irvine.oeis.a139;
// manually divmul at 2021-08-20 23:36

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A139480 a(n) = A000043(n) - 3.
 * @author Georg Fischer
 */
public class A139480 extends A000043 {

  /** Construct the sequence. */
  public A139480() {
    super(2);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(3);
  }
}
