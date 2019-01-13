package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010219.
 * @author Sean A. Irvine
 */
public class A010219 extends PrependSequence {

  /** Construct the sequence. */
  public A010219() {
    super(new PeriodicSequence(4, 2, 1, 2, 4, 26), Z.valueOf(13));
  }
}

