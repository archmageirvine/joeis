package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040002 Continued fraction for sqrt(5).
 * @author Georg Fischer
 */
public class A040002 extends PrependSequence {

  /** Construct the sequence. */
  public A040002() {
    super(new PeriodicSequence(4), Z.valueOf(2));
  }
}
