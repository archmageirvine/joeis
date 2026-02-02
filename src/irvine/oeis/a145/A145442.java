package irvine.oeis.a145;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A145442 Multipliers of SI prefixes, in increasing order.
 * @author Georg Fischer
 */
public class A145442 extends FiniteSequence {

  /** Construct the sequence. */
  public A145442() {
    super(1, FINITE, Z.TEN, new Z("100"), new Z("1000"), new Z("1000000"), new Z("1000000000"), new Z("1000000000000"), new Z("1000000000000000"), new Z("1000000000000000000"), new Z("1000000000000000000000"), new Z("1000000000000000000000000"), new Z("1000000000000000000000000000"), new Z("1000000000000000000000000000000"));
  }
}
