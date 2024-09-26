package irvine.oeis.a060;
// manually 2024-09-26

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;

/**
 * A060418 Largest decimal digit in n-th prime.
 * @author Georg Fischer
 */
public class A060418 extends A000040 implements DirectSequence {

  private int mN = 0;
  
  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.DIGIT_SORT_ASCENDING.z(Functions.PRIME.z(n)).modZ(10);
  }

  @Override
  public Z a(final int n) {
    return Functions.DIGIT_SORT_ASCENDING.z(Functions.PRIME.z(n)).modZ(10);
  }

}
