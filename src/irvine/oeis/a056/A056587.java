package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A056587 Tenth power of Fibonacci numbers A000045.
 * @author Georg Fischer
 */
public class A056587 extends A000045 {

  @Override
  public Z next() {
    return super.next().pow(10);
  }
}
