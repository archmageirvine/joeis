package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a003.A003849;
import irvine.oeis.a010.A010060;

/**
 * A080816.
 * @author Sean A. Irvine
 */
public class A080885 extends Combiner {

  /** Construct the sequence. */
  public A080885() {
    super(1, new A010060(), new A003849(), Z::and);
  }
}

