package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072184 extends ComplementSequence {

  /** Construct the sequence. */
  public A072184() {
    super(new A072676(), Z.ONE);
  }
}
