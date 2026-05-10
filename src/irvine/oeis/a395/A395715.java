package irvine.oeis.a395;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000110;
import irvine.oeis.a000.A000798;

/**
 * A395715 Number of relations on an n-set that are reflexive and transitive, but not symmetric.
 * @author Sean A. Irvine
 */
public class A395715 extends Combiner {

  /** Construct the sequence. */
  public A395715() {
    super(0, new A000798(), new A000110(), SUBTRACT);
  }
}
