package irvine.oeis.a038;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a005.A005349;
import irvine.oeis.a007.A007602;

/**
 * A038186 Numbers divisible by the sum and product of their digits.
 * @author Sean A. Irvine
 */
public class A038186 extends IntersectionSequence {

  /** Construct the sequence. */
  public A038186() {
    super(new A005349(), new A007602());
  }
}
