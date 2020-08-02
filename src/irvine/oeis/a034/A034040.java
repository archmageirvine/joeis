package irvine.oeis.a034;

import irvine.oeis.SetDifferenceSequence;

/**
 * A034040 Imprimitively but not primitively represented by <code>(x^2+xy+2y^2, x&gt;=0, y&gt;=0)</code>.
 * @author Sean A. Irvine
 */
public class A034040 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A034040() {
    super(new A034038(), new A034037());
  }
}
