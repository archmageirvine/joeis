package irvine.oeis.a228;
// Generated by gen_seq4.pl 2024-11-27.ack/filter at 2024-11-27 22:04

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A228019 Composite numbers whose sum of digits is a composite number.
 * @author Georg Fischer
 */
public class A228019 extends FilterSequence {

  /** Construct the sequence. */
  public A228019() {
    super(1, new A002808(), v -> {
      final Z ds = Functions.DIGIT_SUM.z(v);
      return !ds.equals(Z.ONE) && !Predicates.PRIME.is(ds);
    });
  }
}
