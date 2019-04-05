package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040210 Continued fraction for sqrt(226).
 * @author Georg Fischer
 */
public class A040210 extends PrependSequence {

  /** Construct the sequence. */
  public A040210() {
    super(new PeriodicSequence(30), Z.valueOf(15));
  }
}
