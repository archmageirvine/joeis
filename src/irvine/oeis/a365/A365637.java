package irvine.oeis.a365;

import irvine.oeis.MultiplicativeSequence;

/**
 * A365637 a(n) is the smallest number k such that k*n is a term of A072873.
 * @author Georg Fischer
 */
public class A365637 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A365637() {
    super(1, (p, e) -> {
      final int ip = p.intValueExact();
      return p.pow((long) ip * ((e + ip - 1) / ip) - e);
    });
  }
}
