package irvine.oeis.a214;
// Generated by gen_seq4.pl A060035/parmof3 at 2022-05-06 21:45

import irvine.math.z.Z;
import irvine.oeis.a060.A060035;

/**
 * A214750 Least m &gt; 0 such that n - m divides n^2 + m^2.
 * @author Georg Fischer
 */
public class A214750 extends A060035 {

  /** Construct the sequence. */
  public A214750() {
    super(2, 1, (n, m) -> Z.valueOf(n).square().add((long) m * m).remainder(Z.valueOf(n - m)).isZero());
  }
}
