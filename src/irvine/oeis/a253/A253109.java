package irvine.oeis.a253;
// manually 2021-08-15

import irvine.math.z.Z;
import irvine.oeis.a002.A002708;

/**
 * A253109 a(n) = n ^ (Fibonacci(n) mod n).
 * @author Georg Fischer
 */
public class A253109 extends A002708 {

  protected int mN;

  /** Construct the sequence. */
  public A253109() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(super.next());
  }
}
