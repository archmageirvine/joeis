package irvine.oeis.a365;

import irvine.oeis.MultiplicativeSequence;

/**
 * A365636 a(n) is the smallest multiple of n that is a term of A072873.
 * @author Georg Fischer
 */
public class A365636 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A365636() {
    super(1, (p, e) -> {
      final int ip = p.intValueExact();
      return p.pow((long) ip * ((e + ip - 1) / ip));
    });
  }
}
