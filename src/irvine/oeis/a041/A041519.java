package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041519 Denominators of continued fraction convergents to <code>sqrt(276)</code>.
 * @author Sean A. Irvine
 */
public class A041519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041519() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15550, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 5, 13, 31, 75, 106, 181, 287, 468, 15263, 15731, 30994, 46725, 77719, 202163, 482045, 1166253, 1648298, 2814551, 4462849, 7277400});
  }
}
