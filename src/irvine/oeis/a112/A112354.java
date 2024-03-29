package irvine.oeis.a112;
// Generated by gen_seq4.pl ietman at 2023-02-13 09:44

import irvine.oeis.a000.A000142;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A112354 Inverse Euler transform of n!. Also the number of sequences of permutations with no global descents which are Lyndon (smallest in lexicographic order of all cyclic shifts of the sequences) where the size of the sequence = sum of sizes of the permutations.
 * @author Georg Fischer
 */
public class A112354 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A112354() {
    super(1, new A000142(), 1);
    next();
  }
}
