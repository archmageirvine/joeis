package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A053169 A paradoxical sequence: a positive integer n is in this sequence if and only if n is not in sequence A_n in the database.
 * @author Sean A. Irvine
 */
public class A053169 extends ComplementSequence {

  /** Construct the sequence. */
  public A053169() {
    super(1, new A053873(), Z.ONE);
  }
}
