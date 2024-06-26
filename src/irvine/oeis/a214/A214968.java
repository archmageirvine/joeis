package irvine.oeis.a214;
// Generated by gen_seq4.pl A060035/parmof3 at 2022-05-06 21:45

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a060.A060035;

/**
 * A214968 Least m&gt;0 such that n-m divides L(n)-m, where L = A000032 (Lucas numbers).
 * @author Georg Fischer
 */
public class A214968 extends A060035 {

  /** Construct the sequence. */
  public A214968() {
    super(2, 1, (n, m) -> Functions.LUCAS.z(n).add(-m).remainder(Z.valueOf(n - m)).isZero());
  }
}
