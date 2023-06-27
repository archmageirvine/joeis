package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161159 a(n) = A003739(n)/(5*A001906(n)*A006238(n)).
 * @author Sean A. Irvine
 */
public class A161159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161159() {
    super(1, new long[] {-1, 40, -248, 430, -248, 40}, new long[] {9, 245, 7776, 254035, 8336079, 273725760});
  }
}
