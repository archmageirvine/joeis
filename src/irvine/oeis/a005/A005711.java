package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005711 a(n) = a(n-1) + a(n-9) for n &gt;= 9; a(n) = 1 for n=0..7; a(8) = 2.
 * @author Sean A. Irvine
 */
public class A005711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005711() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 2});
  }
}

