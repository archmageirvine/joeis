package irvine.oeis.a141;

import irvine.oeis.Combiner;
import irvine.oeis.a007.A007318;
import irvine.oeis.a008.A008292;

/**
 * A141691 Triangle read by rows: T(n,m) = (3*A008292(n,m) - A007318(n,m)) / 2.
 * @author Sean A. Irvine
 */
public class A141691 extends Combiner {

  /** Construct the sequence. */
  public A141691() {
    super(0, new A008292(), new A007318(), (e, b) -> e.multiply(3).subtract(b).divide2());
  }
}

