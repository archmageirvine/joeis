package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127619 Number of walks from <code>(0,0)</code> to <code>(n,n)</code> in the region <code>0 &lt;=</code> x-y <code>&lt;= 5</code> with the steps <code>(1,0), (0, 1), (2,0)</code> and <code>(0,2)</code>.
 * @author Sean A. Irvine
 */
public class A127619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127619() {
    super(new long[] {4, -12, -11, 6, 5}, new long[] {1, 1, 5, 22, 117});
  }
}
