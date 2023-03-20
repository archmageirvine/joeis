package irvine.oeis.a278;
// manually simple/nest at 2023-03-20 18:00

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a003.A003145;

/**
 * A278040 The tribonacci representation of a(n) is obtained by appending 0,1 to the tribonacci representation of n (cf. A278038).
 * Formula: <code>a(n) = A003145(n+1) - 1</code>
 * @author Georg Fischer
 */
public class A278040 extends Sequence0 {

  private final A003145 mSeq = new A003145();

  @Override
  public Z next() {
    return mSeq.next().subtract(1);
  }
}
