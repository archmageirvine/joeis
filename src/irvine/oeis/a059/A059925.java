package irvine.oeis.a059;

import irvine.oeis.FilterSequence;
import irvine.oeis.a007.A007530;

/**
 * A059925 Numbers n such that {n, n+2, n+6, n+8, n+30, n+32, n+36, n+38} are all prime.
 * @author Sean A. Irvine
 */
public class A059925 extends FilterSequence {

  /** Construct the sequence. */
  public A059925() {
    super(new A007530(), p -> p.add(30).isProbablePrime()
      && p.add(32).isProbablePrime()
      && p.add(36).isProbablePrime()
      && p.add(38).isProbablePrime());
  }
}
