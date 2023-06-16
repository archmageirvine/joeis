package irvine.oeis.a053;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a048.A048050;

/**
 * A053246 First differences of chowla(n).
 * @author Sean A. Irvine
 */
public class A053246 extends DifferenceSequence {

  /** Construct the sequence. */
  public A053246() {
    super(1, new A048050());
  }
}
