package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A087173 Smallest prime factor of n-th partition number.
 * @author Georg Fischer
 */
public class A087173 extends A000041 {

  /** Construct the sequence. */
  public A087173() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
