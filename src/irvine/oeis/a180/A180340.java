package irvine.oeis.a180;
// Generated by gen_seq4.pl 2024-11-21.ack/sintrif at 2024-11-21 23:03

import irvine.math.z.Z;
import irvine.oeis.a001.A001913;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A180340 Numbers with x digits such that the first x multiples are cyclic permutations of the number, leading 0's omitted (or cyclic numbers).
 * @author Georg Fischer
 */
public class A180340 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A180340() {
    super(1, (term, n) -> Z.TEN.pow(term.subtract(1)).subtract(1).divide(term), "", new A001913());
  }
}
