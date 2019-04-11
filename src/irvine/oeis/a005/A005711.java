package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005711 <code>a(n) = a(n-1) + a(n-9)</code> for <code>n &gt;= 9</code>; <code>a(n) = 1</code> for <code>n=0..7</code>; <code>a(8) = 2</code>.
 * @author Sean A. Irvine
 */
public class A005711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005711() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 2});
  }
}

