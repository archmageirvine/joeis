package irvine.oeis.a157;

import irvine.oeis.GeneralRecurrence;

/**
 * A157101 A Somos-4 variant.
 * @author Georg Fischer
 */
public class A157101 extends GeneralRecurrence {

  /** Construct the sequence. */
  public A157101() {
    super(0, 1, -1, -5, -4);
  }
}
