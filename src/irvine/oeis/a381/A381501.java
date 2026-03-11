package irvine.oeis.a381;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a392.A392750;

/**
 * A381501 Positive integers that do not appear in A381466.
 * @author Sean A. Irvine
 */
public class A381501 extends ComplementSequence {

  /** Construct the sequence. */
  public A381501() {
    super(1, Z.ONE, new A392750());
  }
}

