package irvine.oeis.a080;
// Generated by gen_seq4.pl 2024-05-27/lambdan at 2024-05-28 02:23

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A080210 Lower bound for the multiplicity of a disjoint covering system of congruences.
 * @author Georg Fischer
 */
public class A080210 extends LambdaSequence {

  /** Construct the sequence. */
  public A080210() {
    super(1, n -> n == 1 ? Z.ONE : Functions.GPF.z(n).multiply(Functions.PHI.z(n)).divide(n).add(1));
  }
}
