package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a117.A117870;

/**
 * A072123.
 * @author Sean A. Irvine
 */
public class A076436 extends ComplementSequence {

  /** Construct the sequence. */
  public A076436() {
    super(new A117870(), Z.ONE);
  }
}
