package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006457 Number of elements in <code>Z[ i ]</code> whose `smallest algorithm' is <code>&lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A006457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006457() {
    super(new long[] {-4, 10, -6, -3, 4}, new long[] {1, 5, 17, 49, 125});
  }
}

