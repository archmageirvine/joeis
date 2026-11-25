package irvine.oeis.a316;

import irvine.math.group.Gl2AbelianSubgroups;
import irvine.oeis.LambdaSequence;

/**
 * A316559 Number of abelian subgroups of GL(2,Z_n).
 * @author Gregory Morse
 */
public class A316559 extends LambdaSequence {

  /** Construct the sequence. */
  public A316559() {
    super(1, n -> Gl2AbelianSubgroups.count(n.intValue()));
  }
}
