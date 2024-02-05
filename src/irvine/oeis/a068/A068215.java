package irvine.oeis.a068;

import irvine.oeis.Combiner;
import irvine.oeis.a097.A097801;
import irvine.oeis.a144.A144616;

/**
 * A068215 Denominator of Borwein integral of order 2n+1.
 * @author Sean A. Irvine
 */
public class A068215 extends Combiner {

  /** Construct the sequence. */
  public A068215() {
    super(0, new A144616(), new A097801().skip(), MULTIPLY);
  }
}

