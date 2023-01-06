package irvine.oeis.a060;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002110;

/**
 * A060882 a(n) = n-th primorial (A002110) minus next prime.
 * @author Sean A. Irvine
 */
public class A060882 extends Combiner {

  /** Construct the sequence. */
  public A060882() {
    super(new A002110(), new A000040(), SUBTRACT);
  }
}
