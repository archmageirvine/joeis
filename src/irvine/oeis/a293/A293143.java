package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293143 Number of vertex points in a Sierpinski Carpet grid subdivided into squares: <code>a(n+1) = 8*a(n) - 8*(3^n+1), a(0) = 4</code>.
 * @author Sean A. Irvine
 */
public class A293143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293143() {
    super(new long[] {24, -35, 12}, new long[] {4, 16, 96});
  }
}
