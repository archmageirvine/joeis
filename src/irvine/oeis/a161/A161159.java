package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161159 <code>A003739(n)/(5*A001906(n)*A006238(n))</code>.
 * @author Sean A. Irvine
 */
public class A161159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161159() {
    super(new long[] {-1, 40, -248, 430, -248, 40}, new long[] {9, 245, 7776, 254035, 8336079, 273725760});
  }
}
