package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a003.A003313;
import irvine.oeis.a064.A064097;

/**
 * A076091 Numbers n such that A064097(n) - A003313(n) = 1.
 * @author Sean A. Irvine
 */
public class A076091 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076091() {
    super(1, new Combiner(new A064097(), new A003313(), Combiner.SUBTRACT), Z.ONE::equals);
  }
}
