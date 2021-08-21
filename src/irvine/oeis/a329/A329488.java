package irvine.oeis.a329;
// manually divmul at 2021-08-20 23:36

import irvine.math.z.Z;
import irvine.oeis.a001.A001350;

/**
 * A329488 a(n) = A001350(n)^4.
 * @author Georg Fischer
 */
public class A329488 extends A001350 {

  /** Construct the sequence */
  public A329488() {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().pow(4);
  }
}
