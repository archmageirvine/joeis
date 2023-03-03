package irvine.oeis.a280;
// manually divmul at 2021-08-20 23:36

import irvine.math.z.Z;
import irvine.oeis.a007.A007302;

/**
 * A280737 a(n) = A007302(n) - 1.
 * @author Georg Fischer
 */
public class A280737 extends A007302 {

  /** Construct the sequence. */
  public A280737() {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
