package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042244 Numerators of continued fraction convergents to sqrt(648).
 * @author Sean A. Irvine
 */
public class A042244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042244() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 39202, 0, 0, 0, 0, 0}, new long[] {25, 51, 280, 1731, 8935, 19601, 988985, 1997571, 10976840, 67858611, 350269895, 768398401});
  }
}
