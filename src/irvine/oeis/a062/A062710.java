package irvine.oeis.a062;

import irvine.math.group.BinaryAffineCyclicSubgroups;
import irvine.oeis.LambdaSequence;

/**
 * A062710 Number of cyclic subgroups of AGL(n,2).
 * @author Gregory Morse
 */
public class A062710 extends LambdaSequence {

  /** Construct the sequence. */
  public A062710() {
    super(1, n -> BinaryAffineCyclicSubgroups.count(n.intValue()));
  }
}
