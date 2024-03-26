package irvine.oeis.a060;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000001;
import irvine.oeis.a000.A000688;

/**
 * A060689 Number of nonabelian groups of order n.
 * @author Sean A. Irvine
 */
public class A060689 extends Combiner {

  /** Construct the sequence. */
  public A060689() {
    super(1, new A000001().skip(1), new A000688(), SUBTRACT);
  }
}
