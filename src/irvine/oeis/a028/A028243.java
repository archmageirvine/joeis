package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a000.A000392;

/**
 * A028243 a(n) = 3^(n-1) - 2^n + 1 (essentially Stirling numbers of second kind).
 * @author Sean A. Irvine
 */
public class A028243 extends A000392 {

  /** Construct the sequence. */
  public A028243() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
