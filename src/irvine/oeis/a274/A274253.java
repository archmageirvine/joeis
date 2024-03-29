package irvine.oeis.a274;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (1-12*x+1494*x^2+380888*x^3+17292525*x^4+248136510*x^5+1532347656*x^6+4916629962*x^7+9347647209*x^8+11464268960*x^9+9347652702*x^10+4916635404*x^11+1532337619*x^12+248138478*x^13+17294340*x^14+380562*x^15+1302*x^16)/((1-x)^15*(1+x)*(1+x+x^2))
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A274253 Number of partitions of n^7 into at most three parts.
 * @author Georg Fischer
 */
public class A274253 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A274253() {
    super(0, "[1,-12,1494,380888,17292525,248136510,1532347656,4916629962,9347647209,11464268960,9347652702,4916635404,1532337619,248138478,17294340,380562,1302]", "[1,-13,77,-274,650,-1078,1274,-1066,572,0,-572,1066,-1274,1078,-650,274,-77,13,-1]");
  }
}
