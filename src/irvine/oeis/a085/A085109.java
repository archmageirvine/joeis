package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A085109 Palindromes with more than 3 digits in which the absolute difference of a pair of successive digits is identical.
 * @author Sean A. Irvine
 */
public class A085109 extends FilterSequence {

  /** Construct the sequence. */
  public A085109() {
    super(1, new A002113(), p -> {
      if (p.compareTo(1000) < 0) {
        return false;
      }
      final Z[] q0 = p.divideAndRemainder(10);
      Z[] q = q0[0].divideAndRemainder(10);
      final long d = Math.abs(q0[1].longValue() - q[1].longValue());
      while (!q[0].isZero()) {
        final long v = q[1].longValue();
        q = q[0].divideAndRemainder(10);
        if (Math.abs(q[1].longValue() - v) != d) {
          return false;
        }
      }
      return true;
    });
  }
}

