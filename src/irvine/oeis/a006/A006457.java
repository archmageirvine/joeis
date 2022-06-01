package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006457 Number of elements in Z[ i ] whose 'smallest algorithm' is &lt;= n.
 * @author Sean A. Irvine
 */
public class A006457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006457() {
    super(new long[] {-4, 10, -6, -3, 4}, new long[] {1, 5, 17, 49, 125});
  }
}

