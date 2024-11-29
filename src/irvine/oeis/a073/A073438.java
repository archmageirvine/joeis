package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a000.A000720;
import irvine.oeis.a065.A065855;

/**
 * A073438 Remainder of division G[n]/Pi[n], where G[n] is the number of composites not exceeding n.
 * @author Sean A. Irvine
 */
public class A073438 extends Combiner {

  /** Construct the sequence. */
  public A073438() {
    super(2, new A065855().skip(), new A000720().skip(), Z::mod);
  }
}
