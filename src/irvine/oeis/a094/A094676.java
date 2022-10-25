package irvine.oeis.a094;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A094676 a(n) = least number m such that the quotient m/n is obtained merely by shifting the leftmost digit of m to the right end and the second digit of m is not zero.
 * @author Georg Fischer
 */
public class A094676 extends FiniteSequence {

  /** Construct the sequence. */
  public A094676() {
    super(Z.ONE, new Z("210526315789473684"), new Z("3103448275862068965517241379"), new Z("410256"), new Z("714285"), new Z("6101694915254237288135593220338983050847457627118644067796"), new Z("7101449275362318840579"), new Z("8101265822784"), new Z("91011235955056179775280898876404494382022471"));
  }
}
