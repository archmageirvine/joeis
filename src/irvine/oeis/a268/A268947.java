package irvine.oeis.a268;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A268947 Number of length-6 0..n arrays with no repeated value unequal to the previous repeated value plus one mod n+1.
 * @author Georg Fischer
 */
public class A268947 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A268947() {
    super(1, new long[] {0, 22, 242, 470, 36, -38, -14, 2},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
