package irvine.oeis.a257;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: -11*x*(21*x^16+252*x^15+4025*x^14+359100*x^13+5562025*x^12+496218492*x^11+4272895055*x^10+3412929546*x^9-457241153867*x^8+197493713028*x^7+2213671975*x^6+142920900*x^5+1601975*x^4+103428*x^3+1105*x^2+54*x+86)/((x-1)*(x^2-20*x+1)*(x^2+20*x+1)*(x^4+398*x^2+1)*(x^8+158402*x^4+1))
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A257722 Hexagonal numbers (A000384) that are the sum of eleven consecutive hexagonal numbers.
 * @author Georg Fischer
 */
public class A257722 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A257722() {
    super(1, "[0,946,594,12155,1137708,17621725,1572129900,24350391725,2172430843308,-5029652692537,37542225006,47001845605,5458403412,61182275,3950100,44275,2772,231]", "[1,-1,0,0,0,0,0,0,-25091193602,25091193602,0,0,0,0,0,0,1,-1]");
  }
}
