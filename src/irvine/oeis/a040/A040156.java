package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040156 Continued fraction for sqrt(170).
 * @author Georg Fischer
 */
public class A040156 extends PrependSequence {

  /** Construct the sequence. */
  public A040156() {
    super(new PeriodicSequence(26), Z.valueOf(13));
  }
}
