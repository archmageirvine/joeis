package irvine.oeis.a260;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000384;

/**
 * A260233 Smallest prime factor of the n-th hexagonal number (A000384).
 * @author Georg Fischer
 */
public class A260233 extends A000384 {

  /** Construct the sequence. */
  public A260233() {
    super(2);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
