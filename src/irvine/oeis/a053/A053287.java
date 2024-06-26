package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000225;

/**
 * A053287 Euler totient function (A000010) of 2^n - 1.
 * @author Sean A. Irvine
 */
public class A053287 extends A000225 {

  /** Construct the sequence. */
  public A053287() {
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

