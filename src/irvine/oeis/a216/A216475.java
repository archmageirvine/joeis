package irvine.oeis.a216;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A216475 The number of numbers coprime to and less than n+2, excluding 2.
 * @author Georg Fischer
 */
public class A216475 extends A000010 {

  private int mN = 0;

  /** Construct the sequence. */
  public A216475() {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    // (PARI) a(n)=eulerphi(n+2)-n%2
    ++mN;
    return super.next().subtract(mN & 1);
  }
}
