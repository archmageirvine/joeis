package irvine.oeis.a059;

import irvine.oeis.Combiner;
import irvine.oeis.a005.A005156;

/**
 * A059493 A005156(n)*A059488(n)^2.
 * @author Sean A. Irvine
 */
public class A059493 extends Combiner {

  /** Construct the sequence. */
  public A059493() {
    super(0, new A005156(), new A059488(), (a, b) -> a.multiply(b.square()));
  }
}
