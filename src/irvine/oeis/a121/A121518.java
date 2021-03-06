package irvine.oeis.a121;
// Generated by gen_seq4.pl compseq at 2021-06-29 22:31
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a048.A048261;

/**
 * A121518 Numbers that are not the sum of the squares of distinct primes.
 * @author Georg Fischer
 */
public class A121518 extends ComplementSequence {

  /** Construct the sequence. */
  public A121518() {
    super(new A048261(), Z.ONE);
  }
}
