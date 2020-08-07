package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032908 One of four 3rd-order recurring sequences for which the first derived sequence and the Galois transformed sequence coincide.
 * @author Sean A. Irvine
 */
public class A032908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032908() {
    super(new long[] {1, -4, 4}, new long[] {2, 2, 3});
  }
}
