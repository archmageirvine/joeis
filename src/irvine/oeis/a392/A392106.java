package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a076.A076478;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A392106 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A392106 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A392106() {
    super(new A076478(), Z.ONE::add);
  }
}
