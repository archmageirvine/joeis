package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082876 Number of prime divisors (counted with multiplicity) of numbers of form a^n + b^n + c^n + ..., where a*b*c* ... is the prime factorization of n.
 * @author Sean A. Irvine
 */
public class A082876 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082876() {
    super(1, new A082872(), Functions.BIG_OMEGA::z);
  }
}
