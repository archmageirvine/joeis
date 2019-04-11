package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118979 O.g.f: <code>-12*x^3/(-1+x)/(-1+2*x)/(-1+3*x) = -2-2/(-1+3*x)-6/(-1+x)+6/(-1+2*x) </code>.
 * @author Sean A. Irvine
 */
public class A118979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118979() {
    super(new long[] {6, -11, 6}, new long[] {12, 72, 300});
  }
}
