package irvine.oeis.a076;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A076899 Let u(1)=u(2)=u(3)=1, u(n)=sign(u(n-1)-u(n-2))/(u(n-3)+1); then a(n) is the denominator of u(n).
 * @author Georg Fischer
 */
public class A076899 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A076899() {
    super(1, "[0,1,1,1,0,1,1,-1,-2,-2,0,1,1,-1,-1,-1]", "[1,0,0,-1,0,0,-1,0,0,1,0,0,-1,0,0,1]");
  }
}
