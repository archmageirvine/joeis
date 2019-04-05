package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040871 Continued fraction for sqrt(902).
 * @author Georg Fischer
 */
public class A040871 extends PrependSequence {

  /** Construct the sequence. */
  public A040871() {
    super(new PeriodicSequence(30, 60), Z.valueOf(30));
  }
}
