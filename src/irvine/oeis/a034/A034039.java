package irvine.oeis.a034;

import irvine.oeis.SetDifferenceSequence;

/**
 * A034039 Numbers that are primitively but not imprimitively represented by (x^2+xy+2y^2, x&gt;=0, y&gt;=0).
 * @author Sean A. Irvine
 */
public class A034039 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A034039() {
    super(new A034037(), new A034038());
  }
}
