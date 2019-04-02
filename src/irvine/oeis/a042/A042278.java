package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042278 Numerators of continued fraction convergents to sqrt(665).
 * @author Sean A. Irvine
 */
public class A042278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042278() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 27438, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {25, 26, 103, 129, 361, 851, 2063, 2914, 10805, 13719, 696755, 710474, 2828177, 3538651, 9905479, 23349609, 56604697, 79954306, 296467615, 376421921});
  }
}
