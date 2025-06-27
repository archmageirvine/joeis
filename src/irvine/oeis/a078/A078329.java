package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A078329 Primes p such that mu(p+1)=-1, where mu denotes the moebius function.
 * @author Sean A. Irvine
 */
public class A078329 extends FilterSequence {

  /** Construct the sequence. */
  public A078329() {
    super(1, new A000040(), p -> Functions.MOBIUS.i(p.add(1)) == -1);
  }
}

