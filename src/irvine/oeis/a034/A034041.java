package irvine.oeis.a034;

import irvine.oeis.IntersectionSequence;

/**
 * A034041 Both primitively and imprimitively represented by (x^2+xy+2y^2, x&gt;=0, y&gt;=0).
 * @author Sean A. Irvine
 */
public class A034041 extends IntersectionSequence {

  /** Construct the sequence. */
  public A034041() {
    super(new A034038(), new A034037());
  }
}
