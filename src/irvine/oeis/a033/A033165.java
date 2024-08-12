package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a229.A229057;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A033165 First occurrence of n as a term in the continued fraction for zeta(3).
 * @author Sean A. Irvine
 */
public class A033165 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A033165() {
    super(new A229057(), Z.ONE::add);
  }
}
