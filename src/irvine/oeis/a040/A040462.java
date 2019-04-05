package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040462 Continued fraction for sqrt(485).
 * @author Georg Fischer
 */
public class A040462 extends PrependSequence {

  /** Construct the sequence. */
  public A040462() {
    super(new PeriodicSequence(44), Z.valueOf(22));
  }
}
