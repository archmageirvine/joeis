package irvine.oeis.a296;

import irvine.oeis.InterleaveSequence;
import irvine.oeis.a174.A174344;
import irvine.oeis.a274.A274923;

/**
 * A296030 Pairs of coordinates for successive integers in the square spiral (counterclockwise).
 * @author Sean A. Irvine
 */
public class A296030 extends InterleaveSequence {

  /** Construct the sequence. */
  public A296030() {
    super(1, new A174344(), new A274923());
  }
}
