package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a073.A073734;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A064740 Smallest controlling prime when A064413(n) is computed.
 * @author Sean A. Irvine
 */
public class A064740 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A064740() {
    super(new A073734(), k -> Z.TWO.max(Functions.LPF.z(k)));
  }
}

