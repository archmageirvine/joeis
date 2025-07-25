package irvine.oeis.a164;
// Generated by gen_seq4.pl 2025-07-15.ack/lingf at 2025-07-15 23:51

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A164787 Polynomial expansion of p(x)=1/(1 - 3 x + 2 x^2 + 2 x^3 - 4 x^4 + 4 x^5 - 2 x^6 - 2 x^7 + 3 x^8 - x^9 - x^17 + 3 x^18 - 2 x^19 - 2 x^20 + 4 x^21 - 4 x^22 + 2 x^23 + 2 x^24 - 3 x^25 + x^26).
 * @author Georg Fischer
 */
public class A164787 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A164787() {
    super(0, "[1]", "[1,-3,2,2,-4,4,-2,-2,3,-1,0,0,0,0,0,0,0,-1,3,-2,-2,4,-4,2,2,-3,1]");
  }
}
