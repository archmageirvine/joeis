package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041916 Numerators of continued fraction convergents to <code>sqrt(480)</code>.
 * @author Sean A. Irvine
 */
public class A041916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041916() {
    super(new long[] {-1, 0, 0, 0, 482, 0, 0, 0}, new long[] {21, 22, 219, 241, 10341, 10582, 105579, 116161});
  }
}
