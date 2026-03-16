package irvine.oeis.a392;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a079.A079418;

/**
 * A392982 allocated for Philip Jameson.
 * @author Sean A. Irvine
 */
public class A392982 extends DifferenceSequence {

  /** Construct the sequence. */
  public A392982() {
    super(1, new A079418().prepend(1));
  }
}
