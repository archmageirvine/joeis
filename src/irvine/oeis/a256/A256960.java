package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256960 <code>a(0)=1, a(1)=4;</code> thereafter <code>a(n) = a(n-2)+2*A055099(n-1)+2^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A256960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256960() {
    super(new long[] {-4, -8, 1, 4}, new long[] {1, 4, 11, 36});
  }
}
