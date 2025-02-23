package irvine.oeis.a192;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A192473 Coefficient of x in the reduction by x^2-&gt;x+1 of the polynomial p(n,x)=1+x^n+x^(2n+2).
 * @author Georg Fischer
 */
public class A192473 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A192473() {
    super(1, "[0,4,-7,-1,1]", "[1,-4,3,2,-1]");
  }
}
