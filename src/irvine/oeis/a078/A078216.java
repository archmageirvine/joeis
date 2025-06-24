package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078216 a(n) = A078215(n)^(1/2).
 * @author Sean A. Irvine
 */
public class A078216 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A078216() {
    super(new A078215(), Z::sqrt);
  }
}

