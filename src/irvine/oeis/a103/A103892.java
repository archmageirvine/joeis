package irvine.oeis.a103;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A103892 Greatest prime factor of prime(n)! / prime(n)# + 1.
 * @author Georg Fischer
 */
public class A103892 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A103892() {
    super(1, new A103890(), v -> Functions.GPF.z(v));
  }
}
