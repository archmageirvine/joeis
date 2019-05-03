package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123224 <code>a(n) =</code> the first row sum of <code>M^(n-1)</code>, where M <code>= matrix(4,4, [1,1,1,1;0,1,2,3;0,1,3,6;0,1,4,10])</code>.
 * @author Sean A. Irvine
 */
public class A123224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123224() {
    super(new long[] {-1, 15, -28, 15}, new long[] {1, 4, 35, 428});
  }
}
