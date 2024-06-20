package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000040;

/**
 * A008578 Prime numbers at the beginning of the 20th century (today 1 is no longer regarded as a prime).
 * @author Sean A. Irvine
 */
public class A008578 extends PrependSequence implements DirectSequence {

  /** Construct the sequence. */
  public A008578() {
    super(1, new A000040(), Z.ONE);
  }

  @Override
  public Z a(final Z n) {
    return n.equals(Z.ONE) ? Z.ONE : Functions.PRIME.z(n.subtract(1));
  }

  @Override
  public Z a(final int n) {
    return (n == 1) ? Z.ONE : Functions.PRIME.z(n - 1);
  }

}

