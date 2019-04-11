package irvine.oeis.a138;

import irvine.oeis.FiniteSequence;

/**
 * A138480 Autobiographical numbers: the first digit specifies how many 0 in the number, the next digit specifies how many 1, etc. This version is not limited to 10 digits.
 * @author Georg Fischer
 */
public class A138480 extends FiniteSequence {

  /** Construct the sequence. */
  public A138480() {
    super(1210, 2020, 21200, 3211000, 42101000, 521001000L, 6210001000L, 72100001000L, 821000001000L, 9210000001000L);
  }
}
