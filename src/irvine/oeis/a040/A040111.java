package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040111 Continued fraction for sqrt(123).
 * @author Georg Fischer
 */
public class A040111 extends PrependSequence {

  /** Construct the sequence. */
  public A040111() {
    super(new PeriodicSequence(11, 22), Z.valueOf(11));
  }
}
