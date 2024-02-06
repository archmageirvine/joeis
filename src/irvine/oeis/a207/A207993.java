package irvine.oeis.a207;

import irvine.math.z.Z;
import irvine.oeis.a068.A068253;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068220.
 * @author Sean A. Irvine
 */
public class A207993 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A207993() {
    super(1, new A068253(), k -> Z.ONE.max(k.divide2()));
  }
}
