package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042900 Numerators of continued fraction convergents to <code>sqrt(982)</code>.
 * @author Sean A. Irvine
 */
public class A042900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042900() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 17674, 0, 0, 0, 0, 0}, new long[] {31, 63, 94, 2883, 2977, 8837, 550871, 1110579, 1661450, 50954079, 52615529, 156185137});
  }
}
