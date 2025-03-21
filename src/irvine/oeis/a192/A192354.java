package irvine.oeis.a192;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A192354 Coefficients of x in the reduction of the polynomial p(n,x)=(1/2)((x+2)^n+(x-2)^n) by x^2-&gt;x+1.
 * @author Georg Fischer
 */
public class A192354 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A192354() {
    super(1, "[0,0,1,-1,3]", "[1,-2,-9,10,5]");
  }
}
