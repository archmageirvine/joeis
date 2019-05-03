package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246641 Sequence <code>a(n) = (1 + A007805(n))/2</code>, appearing in a certain touching problem for three circles and a chord, together with <code>A007805</code>.
 * @author Sean A. Irvine
 */
public class A246641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246641() {
    super(new long[] {1, -19, 19}, new long[] {1, 9, 153});
  }
}
