package irvine.oeis.a109;
// Generated by gen_seq4.pl mult at 2022-08-01 11:56

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A109386 G.f. is the logarithm of the g.f. of A107742: Sum_{n&gt;=1} (a(n)/n)*x^n = log( Sum_{n&gt;=0} A107742(n)*x^n ).
 * @author Georg Fischer
 */
public class A109386 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A109386() {
    super(1, (p, e) -> is2(p) ? Z.ONE.shiftLeft(e + 1).subtract(1) : p.pow(e + 2).multiply(e + 1).subtract(p.pow(e + 1).multiply(e + 2)).add(1).divide(p.subtract(1).square()));
  }
}
