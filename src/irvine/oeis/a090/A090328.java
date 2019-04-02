package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090328 Number of rules of a context-free grammar in Chomsky normal form that generates all permutations of n symbols.
 * @author Sean A. Irvine
 */
public class A090328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090328() {
    super(new long[] {3, -7, 5}, new long[] {1, 4, 12});
  }
}
