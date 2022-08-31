package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A050445 Each prime appears later in alphabetical order (in American English) than the one before.
 * @author Georg Fischer
 */
public class A050445 extends FiniteSequence {

  /** Construct the sequence. */
  public A050445() {
    super(Z.TWO,
      Z.valueOf(211),
      Z.valueOf(223),
      Z.valueOf(2003),
      Z.valueOf(2027),
      Z.valueOf(2203),
      Z.valueOf(2221),
      Z.valueOf(2000000000003L),
      Z.valueOf(2000000000203L),
      Z.valueOf(2000000002001L),
      Z.valueOf(2000000002003L),
      Z.valueOf(2000000002223L),
      new Z("2000000000000000000000000000000000041"),
      new Z("2000000000000000000000000000000000429"),
      new Z("2000000000000000000000000000000000653"));
  }
}
