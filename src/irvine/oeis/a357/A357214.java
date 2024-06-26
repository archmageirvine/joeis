package irvine.oeis.a357;
// Generated by gen_seq4.pl 2023-10-19/simtraf at 2023-10-19 23:32

import irvine.math.z.Z;
import irvine.oeis.a065.A065855;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A357214 a(n) = number of subsets S of {1, 2, ..., n} such that every number in S is a composite.
 * @author Georg Fischer
 */
public class A357214 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A357214() {
    super(1, new A065855(), v -> Z.TWO.pow(v));
  }
}
