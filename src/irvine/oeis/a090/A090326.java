package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090326 Number of rules of a context-free grammar in Chomsky normal form that generates all permutations of n symbols.
 * @author Sean A. Irvine
 */
public class A090326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090326() {
    super(new long[] {-6, 17, -17, 7}, new long[] {1, 4, 15, 54});
  }
}
