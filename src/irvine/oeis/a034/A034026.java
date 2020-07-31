package irvine.oeis.a034;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a001.A001481;

/**
 * A034026 Numbers that are primitively or imprimitively represented by <code>x^2+y^2</code>, but not both.
 * @author Sean A. Irvine
 */
public class A034026 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A034026() {
    super(new A001481(), new A034025());
    next(); // skip 0
  }
}
