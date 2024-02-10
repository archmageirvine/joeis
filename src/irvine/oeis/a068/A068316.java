package irvine.oeis.a068;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.a051.A051270;
import irvine.oeis.transform.RunLengthTransform;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068316 Run lengths of the Moebius function applied to A051270 (numbers with 5 distinct prime factors).
 * @author Sean A. Irvine
 */
public class A068316 extends RunLengthTransform {

  /** Construct the sequence. */
  public A068316() {
    super(1, new SimpleTransformSequence(new A051270(), k -> Z.valueOf(Mobius.mobius(k.longValueExact()))));
  }
}
