package irvine.oeis.a038;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a003.A003136;

/**
 * A038160 Intersection of A003136 and A038590.
 * @author Sean A. Irvine
 */
public class A038160 extends IntersectionSequence {

  /** Construct the sequence. */
  public A038160() {
    super(new A038590(), new A003136());
  }
}
