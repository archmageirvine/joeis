package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000120;

/**
 * A001316 Gould's sequence: <code>a(n) = Sum_{k=0..n} (binomial(n,k) mod 2)</code>; number of odd entries in row n of Pascal's triangle <code>(A007318); 2^A000120(n)</code>.
 * @author Sean A. Irvine
 */
public class A001316 extends A000120 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValue());
  }
}
