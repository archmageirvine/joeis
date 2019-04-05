package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040684 Continued fraction for sqrt(711).
 * @author Georg Fischer
 */
public class A040684 extends PrependSequence {

  /** Construct the sequence. */
  public A040684() {
    super(new PeriodicSequence(1, 1, 1, 52), Z.valueOf(26));
  }
}
