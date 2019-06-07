package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176326 <code>a(3n)</code> is the sequence <code>7, 6, 5, 4</code>, ...; <code>a(3n+1)</code> is the sequence <code>9, 11, 13, 15</code>, ...; <code>a(3n+2)</code> is the sequence <code>11, 8, 5, ..</code>.
 * @author Sean A. Irvine
 */
public class A176326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176326() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {7, 9, 11, 6, 11, 8});
  }
}
