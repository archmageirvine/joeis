package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040285 Continued fraction for sqrt(303).
 * @author Georg Fischer
 */
public class A040285 extends PrependSequence {

  /** Construct the sequence. */
  public A040285() {
    super(new PeriodicSequence(2, 2, 5, 2, 2, 34), Z.valueOf(17));
  }
}
