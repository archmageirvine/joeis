package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a000.A000041;
import irvine.oeis.a047.A047993;

/**
 * A064158.
 * @author Sean A. Irvine
 */
public class A064173 extends Combiner {

  /** Construct the sequence. */
  public A064173() {
    super(1, new A000041().skip(), new A047993(), SUBTRACT);
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

