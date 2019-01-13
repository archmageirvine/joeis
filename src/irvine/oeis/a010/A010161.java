package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010161.
 * @author Sean A. Irvine
 */
public class A010161 extends PrependSequence {

  /** Construct the sequence. */
  public A010161() {
    super(new PeriodicSequence(2, 3, 3, 2, 18), Z.NINE);
  }
}

