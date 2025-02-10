package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A074598.
 * @author Sean A. Irvine
 */
public class A075167 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075167() {
    super(1, new A075165(), k -> Z.valueOf(k.bitCount()));
  }
}
