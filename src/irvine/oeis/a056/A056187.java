package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A056187 Least prime factor of n^n + (n+1)^(n+1).
 * @author Sean A. Irvine
 */
public class A056187 extends A056788 {

  /** Construct the sequence. */
  public A056187() {
    super(0);
  }

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
