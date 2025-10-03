package irvine.oeis.a080;

import irvine.oeis.Combiner;
import irvine.oeis.a003.A003849;
import irvine.oeis.a010.A010060;

/**
 * A080816.
 * @author Sean A. Irvine
 */
public class A080884 extends Combiner {

  /** Construct the sequence. */
  public A080884() {
    super(1, new A010060(), new A003849(), ADD);
  }
}

