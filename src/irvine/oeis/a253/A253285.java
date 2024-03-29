package irvine.oeis.a253;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A253285 a(n) = RF(n+1,3)*C(n+2,n-1), where RF(a,n) is the rising factorial.
 * @author Georg Fischer
 */
public class A253285 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A253285() {
    super(0, new long[] {0, 24, -288, 1464, -3720, 2520, 15288, -63336, 133848, -188760, 
      188760, -133848, 63336, -15288, -2520, 3720, -1464, 288, -24},
      new long[] {1, -22, 231, -1540, 7315, -26334, 74613, -170544, 319770, -497420, 
      646646, -705432, 646646, -497420, 319770, -170544, 74613, -26334, 
      7315, -1540, 231, -22, 1});
  }
}
