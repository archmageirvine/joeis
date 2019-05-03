package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132158 <code>a(3n+k) = 3a(3n+k-1)-3a(3n+k-2)+2a(3n+k-3)</code> for k <code>= 0,1; a(3n+2) = 3a(3n-1)-3a(3n-2)</code>, with <code>a(0) = 0,a(1) = 1,a(2) = 3</code>.
 * @author Sean A. Irvine
 */
public class A132158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132158() {
    super(new long[] {5, -5, 5, -1, 1}, new long[] {0, 1, 3, 6, 11});
  }
}
