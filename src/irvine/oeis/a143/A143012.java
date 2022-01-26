package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A143012 Numbers of the form (4^p + 2^p + 1)/7, where p &gt; 3 is prime.
 * @author Georg Fischer
 */
public class A143012 extends A000040 {

  /** Construct the sequence. */
  public A143012() {
    super.next(); // skip 2
    super.next(); // skip 3
  }

  @Override
  public Z next() {
    final int p = super.next().intValue();
    return Z.ONE.shiftLeft(2 * p).add(Z.ONE.shiftLeft(p)).add(1).divide(7);
  }
}
