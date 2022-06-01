package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027557 Number of 3-balanced strings of length n: let d(S)= #(1)'s in S - #(0)'s, then S is k-balanced if every substring T has -k&lt;=d(T)&lt;=k; here k=3.
 * @author Sean A. Irvine
 */
public class A027557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027557() {
    super(new long[] {-2, -2, 3, 1}, new long[] {1, 2, 4, 8});
  }
}
