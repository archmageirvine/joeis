package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A014090.
 * @author Sean A. Irvine
 */
public class A014090 extends ComplementSequence {

  /** Construct the sequence. */
  public A014090() {
    super(new A014089(), Z.ONE);
  }
}
