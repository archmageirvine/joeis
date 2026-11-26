package irvine.oeis.a316;

import irvine.math.group.Gl2AbelianSubgroups;
import irvine.oeis.LambdaSequence;

/**
 * A316559 Number of abelian subgroups of the group GL(2, Z(n)), counting conjugates as distinct.
 * @author Gregory Morse
 */
public class A316559 extends LambdaSequence {

  /** Construct the sequence. */
  public A316559() {
    super(1, n -> Gl2AbelianSubgroups.count(n.intValue()));
  }
}
