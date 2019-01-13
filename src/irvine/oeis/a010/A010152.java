package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010152.
 * @author Sean A. Irvine
 */
public class A010152 extends PrependSequence {

  /** Construct the sequence. */
  public A010152() {
    super(new PeriodicSequence(1, 1, 1, 1, 16), Z.EIGHT);
  }
}

