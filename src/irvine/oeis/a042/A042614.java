package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042614 Numerators of continued fraction convergents to sqrt(836).
 * @author Sean A. Irvine
 */
public class A042614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042614() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 93102, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {28, 29, 318, 347, 665, 1677, 2342, 4019, 42532, 46551, 2649388, 2695939, 29608778, 32304717, 61913495, 156131707, 218045202, 374176909, 3959814292L, 4333991201L});
  }
}
