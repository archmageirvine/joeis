package irvine.oeis.a204;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: -(94*x^21+18950*x^20+265472*x^19+1391863*x^18+4387222*x^17+10120300*x^16+18809933*x^15+29668549*x^14+40847915*x^13+49820911*x^12+54281003*x^11+53032087*x^10+46410392*x^9+36173353*x^8+24844747*x^7+14749481*x^6+7293277*x^5+2809833*x^4+741117*x^3+101368*x^2+3368*x+1)/((x^2-x+1)*(x^4+x^3+x^2+x+1)*(x^2+1)*(x^2+x+1)^2*(x+1)^3*(x-1)^7)
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A204471 Number of 7-element subsets that can be chosen from {1,2,...,14*n+7} having element sum 49*n+28.
 * @author Georg Fischer
 */
public class A204471 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A204471() {
    super(0, "[1,3368,101368,741117,2809833,7293277,14749481,24844747,36173353,46410392,53032087,54281003,49820911,40847915,29668549,18809933,10120300,4387222,1391863,265472,18950,94]", "[1,-2,0,1,0,1,-1,2,-2,-1,0,0,0,1,2,-2,1,-1,0,-1,0,2,-1]");
  }
}
