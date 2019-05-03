package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271997 The icosagen sequence : <code>a(n) = A018227(n)-5</code>, for <code>n &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A271997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271997() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {5, 13, 31, 49, 81, 113});
  }
}
