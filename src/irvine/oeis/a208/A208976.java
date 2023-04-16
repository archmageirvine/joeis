package irvine.oeis.a208;

import irvine.math.z.Z;
import irvine.oeis.a050.A050168;

/**
 * A208976 Row sums of the triangle in A208101.
 * @author Georg Fischer
 */
public class A208976 extends A050168 {

  /** Construct the sequence. */
  public A208976() {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
