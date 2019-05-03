package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145318 Numbers X such that exists Y in N with <code>X^2 = 93*Y^2+31</code>.
 * @author Sean A. Irvine
 */
public class A145318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145318() {
    super(new long[] {-1, 24302}, new long[] {434, 10546634});
  }
}
