package irvine.oeis.a167;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: -40x(x^10+24x^9-7104x^8+167016x^7-378475x^6+378475x^4-167016x^3+7104x^2-24x-1)/(x^12-1152x^11+138048x^10-5263416x^9+72792384x^8-279916416x^7+429599666x^6-279916416x^5+72792384x^4-5263416x^3+138048x^2-1152x+1)
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A167061 Number of spanning trees in G X P_n, where G = {{1, 2}, {1, 3}, {1, 4}, {1, 5}, {2, 3}, {2, 4}, {2, 5}, {3, 4}}.
 * @author Georg Fischer
 */
public class A167061 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A167061() {
    super(1, "[0,40,960,-284160,6680640,-15139000,0,15139000,-6680640,284160,-960,-40]", "[1,-1152,138048,-5263416,72792384,-279916416,429599666,-279916416,72792384,-5263416,138048,-1152,1]");
  }
}
