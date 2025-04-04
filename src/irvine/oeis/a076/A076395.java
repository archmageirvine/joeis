package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A076395 Squares whose external digits form a square and whose internal digits form a prime.
 * @author Sean A. Irvine
 */
public class A076395 extends FilterSequence {

  /** Construct the sequence. */
  public A076395() {
    super(1, new A000290(), k -> {
      final String s = k.toString();
      return s.length() > 2
        && Predicates.SQUARE.is((s.charAt(0) - '0') * 10 + s.charAt(s.length() - 1) - '0')
        && new Z(s.substring(1, s.length() - 1)).isProbablePrime();
    });
  }
}
