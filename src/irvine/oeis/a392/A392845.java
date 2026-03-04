package irvine.oeis.a392;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a007.A007733;

/**
 * A392845 allocated for Arkadiusz Wesolowski.
 * @author Sean A. Irvine
 */
public class A392845 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A392845() {
    super(1, new A007733(), PRIME);
  }
}
