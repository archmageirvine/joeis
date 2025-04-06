package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a117.A117870;

/**
 * A076436 Square board sizes for which the lights-out problem has a unique solution (counting solutions differing only by rotation and reflection as distinct).
 * @author Sean A. Irvine
 */
public class A076436 extends ComplementSequence {

  /** Construct the sequence. */
  public A076436() {
    super(new A117870(), Z.ONE);
  }
}
