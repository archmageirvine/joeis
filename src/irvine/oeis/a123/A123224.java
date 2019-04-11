package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123224 <code>a(n) =</code> the first row sum of M^(n-1), where M = matrix(4,4, <code>[1,1,1,1</code>;0,1,2,3;0,1,3,6;0,1,4,10]).
 * @author Sean A. Irvine
 */
public class A123224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123224() {
    super(new long[] {-1, 15, -28, 15}, new long[] {1, 4, 35, 428});
  }
}
