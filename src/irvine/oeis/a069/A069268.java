package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a000.A000142;
import irvine.oeis.a000.A000217;

/**
 * A266780.
 * @author Sean A. Irvine
 */
public class A069268 extends Combiner {

  /** Construct the sequence. */
  public A069268() {
    super(1, new A000142().skip(), new A000217().skip(), Z::gcd);
  }
}
