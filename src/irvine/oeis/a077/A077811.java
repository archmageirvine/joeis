package irvine.oeis.a077;
// manually knest/eulphi at 2023-03-01 16:41

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a007.A007088;

/**
 * A077811 Euler's totient of numbers containing in their decimal representation only the digits 0 and 1.
 * @author Georg Fischer
 */
public class A077811 extends A007088 {

  /** Construct the sequence. */
  public A077811() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}
